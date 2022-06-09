class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String str1 = s.substring(0,s.length()/2);
        String str2 = s.substring(s.length()/2);
        
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i < str1.length();i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){
                count1++;
            }
            if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u'){
                count2++;
            }
        }
        return count1 == count2;
    }
}
