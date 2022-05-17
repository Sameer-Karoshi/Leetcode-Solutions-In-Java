class Solution {
    public long[] sumOfThree(long num) {
        long middle = num/3;
        if(num == middle*3){
           long[] res = new long[3];
            res[0] = middle - 1;
            res[1] = middle;
            res[2] = middle + 1;
            return res;
        }
        long[] temp = new long[0];
        return temp;
    }
}
