class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int result = 0;
        for(int i = 0;i < words.length;i++){
            boolean isTrue = (words[i].startsWith("a") || words[i].startsWith("e") || words[i].startsWith("i") || words[i].startsWith("o") || words[i].startsWith("u")) && (words[i].endsWith("a") || words[i].endsWith("e") || words[i].endsWith("i") || words[i].endsWith("o") || words[i].endsWith("u"));
            if(isTrue && i >= left && i <= right) {
                result++;
            }
        }
        return result;
    }
}
