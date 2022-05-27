class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        String complement = "";
        for(int i = 0;i < binary.length();i++){
            char ch = binary.charAt(i);
            if(ch == '1'){
                complement = complement + '0';
            }
            else{
                complement = complement + '1';
            }
        }
        return (int)Integer.parseInt(complement,2);
    }
}
