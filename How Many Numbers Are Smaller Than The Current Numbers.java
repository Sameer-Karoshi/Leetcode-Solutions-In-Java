class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] nums2 = new int[nums.length];
        for(int i = 0;i < nums2.length;i++){
            nums2[i] = nums[i];
        }
        Arrays.sort(nums2);
        int[] res = new int[nums.length];
        for(int i = 0;i < nums2.length;i++){
            int count = 0;
            for(int j = 0;j < i;j++){
                if(nums2[j] < nums2[i]){
                    count++;
                }
                else{
                    break;
                }
            } 
            for(int j = 0;j < nums.length;j++){
                if(nums2[i] ==nums[j]){
                    res[j] = count;
                    //break;
                }
            }
        }
        return res;
    }
}
