class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        if(nums.length == 1 && target == nums[0]){
            result[0] = 0;
            result[1] = 0;
            return result;
        }
        boolean firstfound = false;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == target){
                result[0] = i;
                firstfound = true;
                if(firstfound && result[1] == -1){
                    result[1] = i;
                }
            }
        }
        Arrays.sort(result);
        return result;
    }
}
