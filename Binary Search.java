class Solution {
    public int search(int[] nums, int target) {
        //Hehe we will implement binary search here :)
        
        int first = 0;
        int last = nums.length-1;
        int result = 0;
        
        boolean isFound = false;
        
        while(first <= last){
            int mid = (first+last)/2;  
            if(nums[mid] == target){
                result = mid;
                isFound = true;
                break;
            }
            else{
                if(nums[mid] < target){
                    first = mid + 1;
                    last = last;
                }
                else{
                    first = first;
                    last = mid - 1;
                }
            }
        }
        
        if(!isFound){
            result = -1;
        }
     return result;   
    }
}