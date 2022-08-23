class Solution {
    public int minPairSum(int[] nums) {
        //first sort the array
        Arrays.sort(nums);
        //the max sum pair is minimized by making pairs of first and last, second and second last like that
        int res = 0;
        for(int i = 0;i < nums.length/2;i++){
            res = Math.max(res,nums[i]+nums[nums.length-1-i]);
        }
        return res;
    }
}
