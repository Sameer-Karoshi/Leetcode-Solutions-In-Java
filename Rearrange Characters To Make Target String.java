class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i < target.length();i++){
            map1.put(target.charAt(i),0);
        }
        
        for(int i = 0;i < s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                int val = map1.get(s.charAt(i));
                val++;
                map1.put(s.charAt(i),val);
            }
        }
        
        for(int i = 0;i < target.length();i++){
            map2.put(target.charAt(i),0);
        }
        
        for(int i = 0;i < target.length();i++){
            int val = map2.get(target.charAt(i));
            val++;
            map2.put(target.charAt(i),val);
        }
        
        
        int ans = 10000;
        for(Character i : map1.keySet())
        {
            if(map2.containsKey(i))
             ans = Math.min(map1.get(i)/map2.get(i),ans);
            else 
                return 0;
        }
        return ans;
        
    }
}
