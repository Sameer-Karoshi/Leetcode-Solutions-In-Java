class Solution {
    public int threeSumClosest(int[] nums, int target) {
    
        int result = 0;
        int distance = 3000;
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                for(int k = j+1;k < nums.length;k++){
                    int tempsum = nums[i] + nums[j] + nums[k];
                    int tempdistance = Math.abs(tempsum-target);
                    if(tempdistance < distance){
                        distance = tempdistance;
                        sum = tempsum;
                    }
                }
            }
        }
        return sum;
    }
}