class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String firstres = "";
        for(int i = 0; i < firstWord.length();i++){
            int val = firstWord.charAt(i) -97;
            firstres += Integer.toString(val);
        }
        String secondres = "";
        for(int i = 0; i < secondWord.length();i++){
            int val = secondWord.charAt(i) -97;
            secondres += Integer.toString(val);
        }
        String targetres = "";
        for(int i = 0; i < targetWord.length();i++){
            int val = targetWord.charAt(i) -97;
            targetres += Integer.toString(val);
        }
        int res1 = Integer.parseInt(firstres) + Integer.parseInt(secondres);
        int res2 = Integer.parseInt(targetres);
        return res1 == res2;
        
    }
}
