class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],0);
        }
        
        for(int i = 0;i < nums.length;i++){
            int val = map.get(nums[i]);
            val++;
            map.put(nums[i],val);
        }
        int sum = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            if(map.get(key) == 1){
                sum = sum + key;
            }
        }
        return sum;
    }
}
