class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res = 0;
        for(int i = 0;i < nums.length;i++){
            int count = 1;
            for(int j = i;j < nums.length-1;j++){
                if(nums[j] < nums[j+1]){
                    count++;
                }
                else{
                    break;
                }
            }
            //System.out.println(count);
            if(count > res){
                res = count;
            }
        }
        return res;
    }
}
