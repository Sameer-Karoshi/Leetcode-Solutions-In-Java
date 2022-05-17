class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i < nums.length;i++){
            set.add(nums[i]);
        }
        
        int temp = 0;
        int max = 0;
        int prev = set.first()-1;
        int curr = set.first();
        System.out.println(set);
        for(Integer i: set){
            curr = i;
            if(curr == prev + 1){
                temp++;
            }
            else{
                if(temp > max){
                    max = temp;
                }
                temp = 1;
            }
            if(temp>max){
                max = temp;
            }
            prev = curr;
        }
       return max;
    }
}
