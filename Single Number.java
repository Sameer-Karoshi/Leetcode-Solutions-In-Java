import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        
    //First we sort the array :)
        
      Arrays.sort(nums);
      int result = 0;
      if(nums.length == 1){
          result = nums[0];
      }
       else{
           for(int i = 0;i < nums.length;i++){
             
               if(i == nums.length-1){
                   result = nums[i];
               }
               else if(nums[i+1] == nums[i]){
                   i = i + 1;
               }
               else{
                   result = nums[i];
               }
           }
       }
    return result;
    }
}