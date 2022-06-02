class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        
        for(int i = 0;i < words1.length;i++){
            map1.put(words1[i],0);
        }
        
        for(int i = 0;i < words2.length;i++){
            map2.put(words2[i],0);
        }
        
        for(int i = 0;i < words1.length;i++){
            int val = map1.get(words1[i]);
            val++;
            map1.put(words1[i],val);
        }
        
        for(int i = 0;i < words2.length;i++){
            int val = map2.get(words2[i]);
            val++;
            map2.put(words2[i],val);
        }
        
        int res = 0;
        for(Map.Entry<String,Integer> entry : map1.entrySet()){
            String key = entry.getKey();
            if(map1.get(key) == 1 && map2.containsKey(key) && map2.get(key) ==              1){
                res++;
            }
            
        }
        return res;
        
    }
}
