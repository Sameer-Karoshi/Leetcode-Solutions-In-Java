class Solution {
    public boolean isMonotonic(int[] nums) {
       boolean result = false;
    
       //for increasing array :)
       int i = 0; 
       for(i= 0;i < nums.length-1;i++){
           if((nums[i] <= nums[i+1])){
              continue;
           }
           else{
               break;
           }
       }
       if(i == nums.length-1){
           result = true;
       }
        
       //for decreasing array :)
       int j = 0; 
       for(j= 0;j < nums.length-1;j++){
           if((nums[j] >= nums[j+1])){
              continue;
           }
           else{
               break;
           }
       }
       if(j == nums.length-1){
           result = true;
       }
    
        return result;
    }
}