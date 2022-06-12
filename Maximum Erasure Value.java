/*class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int res = 0;
        for(int i = 0;i < nums.length;i++){
            Set<Integer> set = new HashSet<>();
            int sum = 0;
            for(int j = i;j < nums.length;j++){
                sum = sum + nums[j];
                set.add(nums[j]);
                if(set.size() == j-i+1 && sum > res){
                    res = Math.max(sum,res);
                }
                else if(set.size() < j-i+1){
                    break;
                }
            }
            set.clear();
        }
        return res;
    }
}
*/
class Solution{
    public int maximumUniqueSubarray(int[] nums) {        
	int maxScore = 0, currScore = 0;
	Set<Integer> set = new HashSet<>();

	for (int l=0, r=0; r<nums.length; r++) {
		while (!set.add(nums[r])) {
			currScore -= nums[l];
			set.remove(nums[l++]);
		}
		currScore += nums[r];
		maxScore = Math.max(maxScore, currScore);
	}

	return maxScore;
}
}
