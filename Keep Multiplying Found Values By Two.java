class Solution {
    public int findFinalValue(int[] nums, int original) {
       int result = 0;
       boolean isFound = false;
       for(int i = 0;i < nums.length;i++){
           if(nums[i] == original){
               isFound = true;
               original = original*2;
           }
       }
       if(!isFound){
           return original;
       }
        else{
         result = findFinalValue(nums,original);
        }
        return result;
    }
}
