class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        char ch = 'a';
        for(int i = 0;i < key.length();i++){
            if(!map.containsKey(key.charAt(i)) && key.charAt(i) != ' '){
                map.put(key.charAt(i),ch);
                ch++;
            }
        }
        //System.out.println(map);
        String res = "";
        for(int i = 0;i < message.length();i++){
            if(message.charAt(i) == ' '){
                res += " ";
            }
            else if(map.containsKey(message.charAt(i))){
                res += map.get(message.charAt(i));
            }
        }
        return res;
    }
}
