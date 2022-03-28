class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        //hehe implement binary search
        
        int first = 0;
        int last = nums.length-1;
        
        boolean isFound = false;
        
        while(first <= last){
            int mid = (first+last)/2;
            if(nums[mid] == target){
                isFound = true;
                break;
            }
            else if(nums[mid] > target){
                last = mid - 1;
            }
            else{
                first = mid + 1;
            }
        }
        
        return isFound;
    }
}