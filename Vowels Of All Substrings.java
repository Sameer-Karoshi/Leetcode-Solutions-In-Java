class Solution {
    public long countVowels(String word) {
        long res = 0, prev = 0;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                prev = prev + (i + 1);
            res = res + prev;
        }
        
        return res;
    }
}
