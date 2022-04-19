class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0;i < nums.length;i++){
            set.add(nums[i]);
        }
        int result = nums[nums.length-1]+1;
        for(int i = 1;i < nums.length+1;i++){
            if(!set.contains(i)){
               result = i;
                break;
            }
        }
        return result;
    }
}
