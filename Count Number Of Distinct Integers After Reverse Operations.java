class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int reversedValue = 0;
            while (value != 0) {
                reversedValue = reversedValue * 10 + value % 10; 
                value = value / 10;
            }
            set.add(reversedValue);
        }
        return set.size();
    }
}
