class Solution {
    public boolean isPowerOfFour(int n) {
        
        boolean result = false;
        for(int i = 0;i < n;i++){
            double val = Math.pow(4,i);
            double N = (double)n; 
            if(val == N){
                result = true;
                break;
            }
            else if(val > N){
                break;
            }
        }
        return result;
    }
}