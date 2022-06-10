class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            int temp = nums[i];
            int j = i;
            for(j = i+1;j < nums.length;j++){
                if(nums[j-1] < nums[j]){
                    temp = temp + nums[j];
                }
                else{
                    break;
                }
            }
            if(temp > sum){
                sum = temp;
            }
        }
        return sum;
    }
}
