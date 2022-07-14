class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> indexofones = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 1){
                indexofones.add(i);
            }
        }
        
        for(int i = 0;i < indexofones.size()-1;i++){
            if(indexofones.get(i+1)-indexofones.get(i)-1 < k){
                return false;
            }
        }
        return true;
    }
}
