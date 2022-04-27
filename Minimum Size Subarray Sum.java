class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int result = 0;
       int min = Integer.MAX_VALUE;
       for(int i = 0;i < nums.length;i++){
           int sum = 0;
           for(int j = i;j < nums.length;j++){
               sum = sum + nums[j];
               if(sum >= target){
                   result = j - i + 1;
                   if(result < min){
                       min = result;
                   }
               }
           }
       }
        return Math.min(result,min);
    }
}
