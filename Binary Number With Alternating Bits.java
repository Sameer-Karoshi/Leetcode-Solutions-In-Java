class Solution {
    public boolean hasAlternatingBits(int n) {
       String result = Integer.toBinaryString(n);
       for(int i = 0;i < result.length();i++){
           char ch = result.charAt(i);
           if((i % 2 == 0 && ch == '1') || (i % 2 == 1 && ch == '0')){
               continue;
           }
           else{
               return false;
           }
       }
       return true; 
    }
}
