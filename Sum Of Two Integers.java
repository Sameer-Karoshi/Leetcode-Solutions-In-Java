import java.math.*;
class Solution {
    public int getSum(int a, int b) {
      BigInteger A  = BigInteger.valueOf(a);
      BigInteger B  = BigInteger.valueOf(b);
      BigInteger C = A.add(B);
      
      int result = C.intValue();
      return result;
    }
}