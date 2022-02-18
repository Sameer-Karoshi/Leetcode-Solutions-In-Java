import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //First create new array
        int[] nums = new int[nums1.length + nums2.length];
        int i;
        for(i = 0;i < nums1.length;i++){
           nums[i] = nums1[i]; 
        }
        for(int j = 0;j < nums2.length;j++){
            nums[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums);
        
        //Create double variable
        double answer = 0.0;
        if(nums.length % 2 == 1){
            int index = (nums.length)/2;
            answer = nums[index];
        }
        else{
            int index1 = ((nums.length)/2) - 1;
            int index2 = ((nums.length)/2);
            answer = (double)(nums[index1] + nums[index2])/2;
        }
        return answer;
    }
}