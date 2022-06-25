class Solution {
    public boolean checkPossibility(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        for(int i = 0;i < nums.length;i++){
            int temp = nums[i];
            if(i == 0){
                nums[i] = nums[i+1];
            }
            else{
                nums[i] = nums[i-1];
            }
            
            if(arraySortedOrNot(nums,nums.length)){
                return true;
            }
            else{
                nums[i] = temp;
            }
        }
        
        return false;
    }
    public boolean arraySortedOrNot(int arr[], int n)
    {
        // Array has one or no element or the
        // rest are already checked and approved.
        if (n == 1 || n == 0)
            return true;
 
        // Unsorted pair found (Equal values allowed)
        if (arr[n - 1] < arr[n - 2])
            return false;
 
        // Last pair was sorted
        // Keep on checking
        return arraySortedOrNot(arr, n - 1);
    }
}
