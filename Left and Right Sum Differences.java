class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int totalSum = 0;
        for(int i = 0;i < nums.length;i++) {
            totalSum += nums[i];
        }
        int leftSum = 0;
        int rightSum = totalSum;
        int[] result = new int[nums.length];
        for(int i = 0;i < nums.length;i++) {
            rightSum -= nums[i];
            if (i == 0) {
                result[i] = rightSum;
            } else if (i == nums.length - 1) {
                result[i] = leftSum;
            } else {
                result[i] = leftSum - rightSum;
                if (result[i] < 0) {
                    result[i] *= -1;
                }
            }
            leftSum += nums[i];
        }
        return result;
    }
}
