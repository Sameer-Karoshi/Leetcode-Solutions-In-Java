class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        
        int total = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < k){
                total++;
            }
            int product = nums[i];
            for(int j = i + 1;j < nums.length;j++){
              product = product*nums[j];
                if(product >= k){
                    break;
                }
                else{
                    total++;
                }
                
            }
        }
       
        return total;
    }
}