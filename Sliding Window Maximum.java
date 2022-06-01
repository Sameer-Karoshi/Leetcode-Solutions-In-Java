//1: Brute Force Approach: Time Limit Exceeds :(
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        for(int i = 0;i < nums.length-k+1;i++){
            int max = Integer.MIN_VALUE;
            for(int j = i;j < i+k;j++){
                max = Math.max(nums[j],max);
            }
            result[i] = max;
        }
        return result;
    }
}
// Deque
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<int[]> d = new LinkedList<>();
        int ans[] = new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            while(d.size()>0 && (d.peekLast()[0]<=nums[i] || d.peekLast()[1]<=i-k))
                d.pollLast();
            d.addLast(new int[]{nums[i] , i});
            while(d.peekFirst()[1]<=i-k)
                d.pollFirst();
            if(i>=k-1){
                ans[i-k+1] = d.peekFirst()[0];
            }
        }
        return ans;
    }
}
