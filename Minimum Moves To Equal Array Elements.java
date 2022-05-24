class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median_index = nums.length/2;
        int median_element = nums[median_index];
        
        int result = 0;
        for(int i = 0;i < nums.length;i++){
            result = result + Math.abs(nums[i]-median_element);
        }
        return result;
    }
}
