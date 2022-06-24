class Solution {
    public int primePalindrome(int n) {
        //corner case :)
        if(n >= 9989900 && n < 100030001){
            return 100030001;
        }
        for(int i = n;i <= (int)2*Math.pow(10,8);i++){
            if(isPrime(i) && isPalindrome(i)){
                return i;
            }
        }
        return -1;
    }
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(int n)
    {
          
        // Find reverse of n
        int rev = 0;
        for (int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;
              
        // If n and rev are same, 
        // then n is palindrome
        return(n == rev) ? true : false;
    }
}
