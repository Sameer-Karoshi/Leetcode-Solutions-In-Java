class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for(int i = 0;i < words.length;i++){
            HashMap<Character,Character> map = new HashMap<>();
            int j = 0;
            for(j = 0;j < pattern.length();j++){
                if(map.containsKey(pattern.charAt(j)) && map.get(pattern.charAt(j)) != words[i].charAt(j)){
                    break;
                }
                else if(!map.containsKey(pattern.charAt(j)) && map.containsValue(words[i].charAt(j))){
                    break;
                }
                map.put(pattern.charAt(j),words[i].charAt(j));
            }
            if(j == pattern.length()){
                result.add(words[i]);
            }        
        }
        return result;
    }
}
