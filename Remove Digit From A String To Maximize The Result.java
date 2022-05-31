import java.math.*;
class Solution {
    public String removeDigit(String number, char digit) {
        BigInteger max = new BigInteger("0");
        for(int i = 0;i < number.length();i++){
            StringBuilder temp = new StringBuilder(number);
            char ch = number.charAt(i);
            if(ch == digit){
                temp.deleteCharAt(i);
                BigInteger num = new BigInteger(temp.toString());   
                if(num.compareTo(max) == 1){
                    max = num;
                }
            }
        }
        return String.valueOf(max);
    }
}
