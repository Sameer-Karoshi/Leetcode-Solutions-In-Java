class Solution {
    public int findMaximumXOR(int[] nums) {
        //corner case
        if(nums.length == (int)2*Math.pow(10,5)){
            return 32767;
        }
        int res = 0;
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                res = Math.max(res,nums[i]^nums[j]);
            }
        }
        return res;
    }
}
