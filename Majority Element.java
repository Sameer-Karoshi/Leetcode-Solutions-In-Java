import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int count = 0;
        int max_count = 0;
        int max_occ_ele = 0;
        
        for(int i = 0;i < nums.length;i++){
            count = 0;
            int j;
            for(j = i;j < nums.length;j++){
                if(nums[j] == nums[i]){
                    count++;
                }
                else{
                    break;
                }
            }
            if(max_count < count){
                max_count = count;
                max_occ_ele = nums[j-1];
            }
        }
      return max_occ_ele;  
    }
}