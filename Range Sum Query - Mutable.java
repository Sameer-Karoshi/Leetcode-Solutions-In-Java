class NumArray {
    int[] array;
    int totalsum = 0;
    public NumArray(int[] nums) {
        array = new int[nums.length]; 
        for(int i = 0;i < nums.length;i++){
            array[i] = nums[i];
            totalsum += nums[i];
        }
    }
    
    public void update(int index, int val) {
        totalsum = totalsum + (val) - array[index];
        array[index] = val;
    }
    
    public int sumRange(int left, int right) {
        int sum = totalsum;
        for(int i = 0;i < left;i++){
            sum -= array[i];
        }
        for(int i = right+1;i < array.length;i++){
            sum -= array[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
