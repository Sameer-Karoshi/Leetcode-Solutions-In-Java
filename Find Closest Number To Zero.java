class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int closest_dist = Integer.MAX_VALUE;
        int result = -1;
        for(int i = 0;i < nums.length;i++){
            int dist = Math.abs(nums[i]-0);
            if(dist <= closest_dist){
                closest_dist = dist;
                result = nums[i];
            }
        }
        return result;
    }
}
