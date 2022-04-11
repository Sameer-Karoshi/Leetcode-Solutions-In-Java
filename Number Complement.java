class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        String result = "";
        for(int i = 0;i < binary.length();i++){
           char ch = binary.charAt(i);
            if(ch == '0'){
                result = result + '1';
            }
            else{
                result = result + '0';
            }
        }
        return Integer.parseInt(result,2);
    }
}
