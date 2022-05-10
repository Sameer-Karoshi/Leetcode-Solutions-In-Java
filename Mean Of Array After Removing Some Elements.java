class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int val = (int)((arr.length*5)/100);
        int start = val;
        int end = arr.length - val;
        
        double result = 0f;
        for(int i = start;i < end;i++){
            result = result + arr[i];
        }
        
        return result/(end-start);
    }
}
