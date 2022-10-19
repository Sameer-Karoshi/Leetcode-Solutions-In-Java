class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0;i < words.length;i++){
            if (map.containsKey(words[i])){
                int val = map.get(words[i]);
                val++;
                map.put(words[i],val);
            }
            else{
                map.put(words[i],1);
            }
        }
        HashMap<String, Integer> sorted = sortbyValue(map);
        List<String> result = new ArrayList<>();
        
        for(Map.Entry<String, Integer> hm: sorted.entrySet()){
            result.add(hm.getKey());
            if(result.size() == k)
                break;
        }
        return result;
    }
    public HashMap<String, Integer> sortbyValue (HashMap<String, Integer> hm){
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> i1, Map.Entry<String, Integer> i2){
                if(i1.getValue() == i2.getValue())
                    return i1.getKey().compareTo(i2.getKey());
                
                return i2.getValue() - i1.getValue();
            }
        });
        
        HashMap<String, Integer> sorted = new LinkedHashMap<>();
        
        for(Map.Entry<String, Integer> it: list)
            sorted.put(it.getKey(), it.getValue());
        
        return sorted;
    }
}
