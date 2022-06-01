class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],0);
        }
        
        for(int i = 0;i < nums.length;i++){
            int val = map.get(nums[i]);
            val++;
            map.put(nums[i],val);
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value == 1 && !map.containsKey(key-1) && !map.containsKey(key+1)){
                result.add(key);
            }
        } 
        return result;
    }
}
