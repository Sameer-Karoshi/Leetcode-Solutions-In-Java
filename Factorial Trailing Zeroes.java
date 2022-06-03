class Solution {
    public int trailingZeroes(int n) {
        int c5=0;
        while(n>=5)
        {
            c5+=n/5;
            n=n/5;
        }
        return c5;
    }
}
