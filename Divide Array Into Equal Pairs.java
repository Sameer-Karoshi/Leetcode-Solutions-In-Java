class Solution {
    public boolean divideArray(int[] nums) {
       Arrays.sort(nums);
       boolean isPresent = false;
        
       int i = 0;
       for(i = 0;i < nums.length-1;i++){
           if(nums[i] == nums[i+1]){
               i++;
           }
           else{
               break;
           }
       }
      
       if(i == nums.length){
           isPresent = true;
       }
      
       return isPresent;
    }
}