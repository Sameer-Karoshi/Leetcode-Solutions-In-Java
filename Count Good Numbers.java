class Solution {
    static int mod=1_000_000_007;
    public int countGoodNumbers(long n) {
       // int mod=1_000_000_007;
        long odd=n/2;
        long even=n/2+n%2;  //--> use to calculate odd term;
        return (int)(power(5,even)*power(4,odd)%mod);
        
    }
    
    long power(long x,long n){
        if(n==0)
            return 1;
        
       long ans=power(x,n/2);   
       long res=ans*ans;
        res%=mod;
        
        if(n%2==1)
        {
            res=res*x;
        }
            res%=mod;
        return res;
        
    }
}
