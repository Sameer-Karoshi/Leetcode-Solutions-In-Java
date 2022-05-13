class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 1;i < nums.length-1;i++){
            boolean small = false;
            for(int j = 0;j < i;j++){
                if(nums[j] < nums[i]){
                    small = true;
                    break;
                }
            }
            
            boolean great = false;
            for(int j = i+1;j < nums.length;j++){
                if(nums[j] > nums[i]){
                    great = true;
                    break;
                }
            }
            if(small&&great){
                count++;
            }
        }
        return count;
    }
}
