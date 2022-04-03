class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>(); 
        String[] array = s.split(" ");
        if(array.length != pattern.length()){
            return false;
        }
        for(int i = 0;i < pattern.length();i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
               String tempval = array[i];
                if(!map.get(ch).equals(tempval)){
                    return false;
                }
            }
            else{
                String str = array[i];
                if(map.containsValue(str)){
                    return false;
                }
                map.put(ch,array[i]);
            }
        }
        return true;
    }
}