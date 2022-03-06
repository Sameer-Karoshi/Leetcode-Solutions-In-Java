class Solution {
    public String reverseWords(String s) {
        
        //Creating String Array :)
        String[] StrArray = s.split(" ");
        
        for(int i = 0;i < StrArray.length;i++){
            StringBuilder SB = new StringBuilder(StrArray[i]);
            String temp = SB.reverse().toString();
            StrArray[i] = temp;
        }
        
        String result = "";
        for(int i = 0;i < StrArray.length;i++){
            result = result + StrArray[i] + " ";
        }
        return result.trim();
    }
}