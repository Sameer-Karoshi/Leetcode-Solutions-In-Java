class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int i = 0;
        for(i = 0;i < word1.length();i++){
            //if both lengths are same
            if(i < word2.length()){
                res = res + word1.charAt(i);
                res = res + word2.charAt(i);
            }
            else{
                break;
            }
        }
        if(i < word1.length()){
            res += word1.substring(i);
        }
        if(i < word2.length()){
            res += word2.substring(i);
        }
        
        return res;
    }
}
