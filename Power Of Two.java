class Solution {
    public boolean isPowerOfTwo(int n) {
        
        boolean result = false;
        for(int i = 0;i < n;i++){
            double answer = Math.pow(2,i);
            if(answer == n){
                result = true;
                break;
            }
            else if(answer > n){
                break;
            }
        }
        return result;
    }
}