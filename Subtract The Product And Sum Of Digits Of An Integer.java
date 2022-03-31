class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        String num = Integer.toString(n);
        for(int i = 0;i < num.length();i++){
           char ch = num.charAt(i);
           int val = ch - '0';
           product = product*val;
           sum = sum + val; 
        }
        
        return product-sum;
    }
}