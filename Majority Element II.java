class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        HashSet<Integer> set=new HashSet();  
        List list;
        
        if(nums.length < 3){
            for(int i = 0;i < nums.length;i++){
                set.add(nums[i]);
            }
            list = new ArrayList<>(set);
            return list;
        }
        
        //Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            int count = 0;
            for(int j = i;j < nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length/3){
                set.add(nums[i]);
            }
        }
        list = new ArrayList<>(set);
        return list;
    }
}