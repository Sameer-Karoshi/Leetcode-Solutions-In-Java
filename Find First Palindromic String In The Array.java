class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0;i < words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            String temp = sb.reverse().toString();
            if(words[i].equals(temp)){
                return words[i];
            }
        }
        return "";
    }
}
