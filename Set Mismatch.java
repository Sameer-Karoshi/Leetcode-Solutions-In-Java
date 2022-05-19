class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int duplicate = 0;
        for(int i = 0;i < nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                duplicate = nums[i];
                break;
            }
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0;i < nums.length;i++){
            set.add(nums[i]);
        }
        int[] result = new int[2];
        result[0] = duplicate;
        for(int i = 1;i < nums.length + 1;i++){
            if(!set.contains(i)){
                result[1] = i;
                break;
            }
        }
        return result;
    }
}
