class Solution {
    public List<Integer> intersection(int[][] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                if(map.containsKey(nums[i][j])){
                    int val = map.get(nums[i][j]);
                    val++;
                    map.put(nums[i][j],val);
                }
                else{
                    map.put(nums[i][j],1);
                }
            }
        }
        //System.out.println(map);
        List<Integer> res = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            int key = (int)entry.getKey();
            int value = (int)entry.getValue();
            if(value == nums.length){
                res.add(key);
            }
        }
        return res;
    }
}
