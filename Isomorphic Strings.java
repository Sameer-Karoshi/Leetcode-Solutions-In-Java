class Solution {
    public boolean isIsomorphic(String s, String t) {
        //We create a hashmap with characters
        HashMap<Character,Character> mapa = new HashMap<>();
        //Since we know both strings are the same length we can iterate through any of them
        for(int i = 0; i<s.length(); i++){
            //We check if the map contains the key (Character in the first string)
            if(mapa.containsKey(s.charAt(i))){
                //If it's contained in the map, but represents a different character, we return false
                if(t.charAt(i) != mapa.get(s.charAt(i))){
                    return false;
                }
            }
            //If it isn't contained in the map
            else{
                //But the value has a key assinged to it, we return false
                if(mapa.containsValue(t.charAt(i))){
                    return false;
                }
                //Otherwise we add the pair to the map
                mapa.put(s.charAt(i),t.charAt(i));
            }
        }
        //Finally, if every check goes nicely, we return true
        return true;
    }
}