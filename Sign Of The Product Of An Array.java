class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        int prod = 1;
        for(int i = 0;i < nums.length;i++){
            prod = prod*nums[i];
            if(nums[i] < 0){
                neg++;
            }
            else if(nums[i] == 0){
                return 0;
            }
        }
        
        if(neg%2 == 1){
            return -1;
        }
        else if(neg%2 == 0){
            return 1;
        }
        return 0;
    }
}
