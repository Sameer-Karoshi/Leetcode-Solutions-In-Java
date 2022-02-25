import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        
        //first check number of occurance of var in nums
        int count_of_val = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == val){
                count_of_val++;
            }
        }
        
        int[] temp = new int[nums.length-count_of_val];
        
        int j = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != val){
                temp[j] = nums[i];
                j++;
            }
        }
        
        //change the orignal array :)
        for(int i = 0;i < j;i++){
            nums[i] = temp[i];
        }
        return j;
    }
}