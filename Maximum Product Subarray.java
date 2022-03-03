class Solution {
    public int maxProduct(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        int productMax = 0;
        for(int i = 0;i < nums.length;i++){
            int temp = 1;
            for(int j = i;j < nums.length;j++){
                temp = temp*nums[j];
                if(temp > productMax){
                  productMax = temp;  
                }
                //System.out.println(productMax);
            }
        }
        
        return productMax;
    }
}