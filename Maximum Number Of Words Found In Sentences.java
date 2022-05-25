class Solution {
    public int mostWordsFound(String[] sentences) {
        int maximum = 0;
        for(int i = 0;i < sentences.length;i++){
            String[] temp = sentences[i].split(" ");
            maximum = Math.max(temp.length,maximum);
        }
        return maximum;
    }
}
