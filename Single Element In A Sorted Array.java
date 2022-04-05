class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int result = 0;
        int i = 0;
        for(i = 0;i < nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                result = nums[i];
                break;
            }
            else{
                i++;
            }
        }
        if(i == nums.length-1){
            result = nums[nums.length-1];
        }
        return result;
    }
}