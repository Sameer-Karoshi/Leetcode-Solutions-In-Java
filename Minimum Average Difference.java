class Solution {
    public int minimumAverageDifference(int[] nums) {
        long totalSum = 0;
        for (int i: nums) {
            totalSum += i;
        }
        long sumFromStart = 0;
        long minAvgDiff = Integer.MAX_VALUE;
        int resultIndex = -1;
        for(int i = 0;i < nums.length;i++){
            sumFromStart += nums[i];
            long averageFromStart = sumFromStart / (i+1);
            long averageFromEnd = 0;
            if (i != nums.length - 1){
                averageFromEnd = (totalSum - sumFromStart)/(nums.length - i - 1);
            }

            if (Math.abs(averageFromEnd - averageFromStart) < minAvgDiff){
                minAvgDiff =  Math.abs(averageFromEnd - averageFromStart);
                resultIndex = i;
            }
        }
        return resultIndex;
    }
}
