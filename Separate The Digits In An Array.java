class Solution {
    public int[] separateDigits(int[] nums) {
        String numsString = "";
        for(int i = 0;i < nums.length;i++){
            numsString += Integer.toString(nums[i]);
        }
        int[] result = new int[numsString.length()];
        for(int i = 0;i < numsString.length();i++){
            result[i] = numsString.charAt(i) - '0';
        }
        return result;
    }
}
