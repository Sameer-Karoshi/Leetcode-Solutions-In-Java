class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       String[] morsecodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(int i = 0;i < words.length;i++){
            String temp = "";
            for(int j = 0;j < words[i].length();j++){
                char ch = words[i].charAt(j);
                int index = ch - 97;
                temp += morsecodes[index];
            }
            set.add(temp);
        }
        return set.size();
        
    }
}
