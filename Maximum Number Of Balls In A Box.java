class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] ballcountarray = new int[highLimit];
        for(int i = lowLimit;i < highLimit+1;i++){
            int sum = 0;
            int j = i;
            while(j > 0){
                sum = sum + j%10;
                j = j/10;
            }
            ballcountarray[sum-1]++;
        }
        
        int res = Integer.MIN_VALUE;
        for(int i: ballcountarray){
            res = Math.max(res,i);
        }
        return res;
    }
}
