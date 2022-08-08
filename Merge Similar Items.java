class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        //for item 1
        for(int i = 0;i < items1.length;i++){
            if(map.containsKey(items1[i][0])){
                int val = map.get(items1[i][0]);
                val = val + items1[i][1];
                map.put(items1[i][0],val);
            }
            else{
                map.put(items1[i][0],items1[i][1]);
            }
        }
        //for item 2
        for(int i = 0;i < items2.length;i++){
            if(map.containsKey(items2[i][0])){
                int val = map.get(items2[i][0]);
                val = val + items2[i][1];
                map.put(items2[i][0],val);
            }
            else{
                map.put(items2[i][0],items2[i][1]);
            }
        }
        
        List<List<Integer>> res = new ArrayList<>();
        for (Integer i : map.keySet()){
            List<Integer> list = new ArrayList<>();
            list.add(i);
            list.add(map.get(i));
            res.add(list);
        }
        return res;
    }
}
