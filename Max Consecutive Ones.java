class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        String str = "";
        for(int i = 0;i < nums.length;i++){
            str = str + Integer.toString(nums[i]);
        }
        String[] array = str.split("0");
        int max = 0;
        for(int i = 0;i < array.length;i++){
            int temp = array[i].length();
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }
}