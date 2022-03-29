class Solution {
    public int findDuplicate(int[] nums) {
        
       for(int i = 0;i < nums.length;i++){
         nums[nums[i]%nums.length] = nums.length + nums[nums[i]%nums.length];
       }
        
       int result = 0;
       for(int i = 0;i < nums.length;i++){
           if(nums[i] > 2*nums.length){
               result = i;
               break;
           }
       }
        return result;
    }
}
