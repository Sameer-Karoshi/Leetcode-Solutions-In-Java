class Solution {
    public String longestPalindrome(String s) {
        //Time Limit Exceeds :(
       /* int max = 0;
        String res = "";
        boolean found = false;
        for(int i = 0;i < s.length();i++){
            for(int j = s.length()-1;j > i-1;j--){
                String temp1 = s.substring(i,j+1);
                StringBuilder sb = new StringBuilder(temp1);
                String temp2 = sb.reverse().toString();
                if(temp1.equals(temp2) && temp1.length() > max){
                    res = temp1;
                    max = temp1.length();
                    found = true;
                    break;
                }
            }
        }
        return res;
        */
        int maxLength = 0;
        int startIndex = -1;
        for(int i=0;i<s.length();++i){
            
            int len1 = palindrome(s,i,i);
            int len2 = palindrome(s,i,i+1);
            int maxlen = Math.max(len1,len2);
            if(maxLength < maxlen){
                maxLength = maxlen;
                startIndex = i - (maxlen-1)/2;
            }
        }
        
        return s.substring(startIndex, startIndex + maxLength);
    }
    public int palindrome(String s, int l, int r){
        if(l>r)
            return 0;
        
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        
        return r-l-1;
    }
}
