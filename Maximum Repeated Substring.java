class Solution {
    public int maxRepeating(String sequence, String word) {
        String ans = word;
        int res = 0;
        for(int i = 0;i < sequence.length()/word.length();i++){
            if(sequence.contains(ans)){
                res++;
                ans = ans + word;
            }
            else{
                return res;
            }
        }
        return res;
    }
}
