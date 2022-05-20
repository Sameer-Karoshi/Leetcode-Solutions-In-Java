class Solution {
    public int findMiddleIndex(int[] nums) {
       if(nums.length == 1){
           return 0;
       }
       for(int i = 0;i < nums.length;i++){
           int leftsum = 0;
           for(int j = 0;j < i;j++){
               leftsum = leftsum + nums[j];
           }
           
           int rightsum = 0;
           for(int j = i+1;j < nums.length;j++){
               rightsum = rightsum + nums[j];
           }
           if(leftsum == rightsum){
               return i;
           }
       }
        return -1;
    }
}
