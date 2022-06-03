class Solution {
    public boolean isHappy(int n) {
        int res = 0;
        while(n > 0){
            res = res + (int)Math.pow(n%10,2);
            n = n/10;
        }
        if(res == 1){
            return true;
        }
        else if(res < 7){
            return false;
        }
        return isHappy(res);
    }
}
