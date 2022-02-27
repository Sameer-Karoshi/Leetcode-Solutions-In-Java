class Solution {
    public void moveZeroes(int[] nums) {
        //Create a new array :)
        int[] array = new int[nums.length];
        
        int j = 0; // for array :)
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                array[j] = nums[i];
                j++;
            }
        }
        
        for(int k = j;k < array.length;k++){
            array[k] = 0;
        }
        
        for(int i = 0;i < nums.length;i++){
            nums[i] = array[i];
        }
    }
}