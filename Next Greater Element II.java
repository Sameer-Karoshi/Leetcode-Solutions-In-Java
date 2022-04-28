class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int[] result = new int[nums.length];
       for(int i = 0;i < nums.length;i++){
           boolean found = false;
           int max = -1;
           for(int j = i+1;j < nums.length;j++){
               if(nums[j]>nums[i]){
                   max = nums[j];
                   found = true;
                   break;
               }
           }
           if(found){
               result[i] = max;
           }
           else{
               for(int j = 0;j < i;j++){
                if(nums[j]>nums[i]){
                   max = nums[j];
                   break;
               }
               }
              result[i] = max;
           }
       }
        return result;
    }
}
