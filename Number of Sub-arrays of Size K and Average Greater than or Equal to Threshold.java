class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0;
        for(int i = 0;i <= arr.length - k;i++) {
            int sum = 0;
            for(int j = i;j < i + k;j++) {
                sum += arr[j];
            }
            
            if ((sum / k) >= threshold) {
                res++;
            }
        }
        return res;
    }
}