class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        if(n == 1){
            res[0] = 0;
            return res;
        }
        int num = n/2;
        if(n%2 == 0){
            for(int i = 0;i < n;i = i + 2){
                res[i] = num;
                res[i+1] = num*(-1);
                num--;
            }
        }
        else{
            for(int i = 0;i < n-1;i = i + 2){
                res[i] = num;
                res[i+1] = num*(-1);
                num--;
            }
            res[n-1] = 0;
        }
        Arrays.sort(res);
        return res;
        
    }
}
