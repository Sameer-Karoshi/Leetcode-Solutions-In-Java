class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] result = new int[n*(n+1)/2];
        int k = 0;
        for(int i = 0;i < n;i++){
            int sum = 0;
            for(int j = i;j < n;j++){
                sum = sum + nums[j];
                //System.out.println(sum);
                result[k++] = sum;
            }
        }
        Arrays.sort(result);
        long res = 0;
        for(int i = left-1;i < right;i++){
            res = res + result[i];
        }
        return (int)(res % (int)(Math.pow(10, 9) + 7));
    }
}
