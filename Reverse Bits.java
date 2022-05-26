public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String num = Integer.toBinaryString(n);
        int z = 32 - num.length();
        String zeroes = "";
        for(int i = 0;i < z;i++){
            zeroes = zeroes + '0';
        }
        num = zeroes + num;
        StringBuilder SB = new StringBuilder(num);
        String result = SB.reverse().toString();
        //System.out.println(result.length());
        long res = 0;
        int j = 0;
        for(int i = result.length()-1;i > -1;i--){
            int ch = result.charAt(i) - 48;
            //System.out.println(ch);
            res = res + (long)Math.pow(2,j)*ch;
            j++;
        }
        return (int)res;
    }
}
