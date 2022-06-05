class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int first = 0;
        int last = n;
        for(int i = 0;i < nums.length;i++){
            if(i%2 == 0){
                result[i] = nums[first++];
            }
            else{
                result[i] = nums[last++];
            }
        }
        return result;
    }
}
