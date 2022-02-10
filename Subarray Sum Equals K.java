class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int no_of_subarrays = 0;
        for(int i = 0;i < nums.length;i++){
            int result = 0;
            for(int j = i;j < nums.length;j++){
                
                result = result + nums[j];
                if(result == k){
                    no_of_subarrays++;
                }       
            }
        }
       return no_of_subarrays; 
    }
}