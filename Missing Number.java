class Solution {
    public int missingNumber(int[] nums) {
        //First lets sort the array
        
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length-i-1;j++){
                int temp = 0;
                if(nums[j+1] < nums[j]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        
        int n = nums.length;
        int result = n;
        for(int i = 0;i < n;i++){
            if(nums[i] != i){
                result = i;
                break;
            }
        }
        
        return result;
    }
}