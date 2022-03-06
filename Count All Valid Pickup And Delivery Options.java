class Solution {
    public int countOrders(int n) {
        
        //They alreday mentioned result can be long :) so declare long variable
        long result = 1;
        long modulo = 1000000007; //10^9 + 7
        
        for(int i=1; i<=n; i++){
            result = result * i * (2*i - 1) % modulo;
        }
        return (int)result;
    }
}