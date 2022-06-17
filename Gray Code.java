class Solution {
    public List<Integer> grayCode(int n) {
        //Ref Diagram: https://www.engineersgarage.com/vhdl-tutorial-20-designing-4-bit-binary-to-gray-gray-to-binary-code-converters/
        //first lets convert each no to its binary form
        List<String> binary = new ArrayList<>();
        for(int i = 0;i < (int)Math.pow(2,n);i++){
            binary.add(Integer.toBinaryString(i));
        }
        //System.out.println(binary);
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i < binary.size();i++){
            String temp = "";
            for(int j = 0;j < binary.get(i).length();j++){
                if(j == 0){
                   temp = temp + binary.get(i).charAt(j); 
                }
                else{
                    char ch1 = binary.get(i).charAt(j);
                    char ch2 = binary.get(i).charAt(j-1);
                    if(ch1 == ch2){
                        temp = temp + '0';
                    }
                    else{
                        temp = temp + '1';
                    }
                }
            }
            result.add(Integer.parseInt(temp,2));
        }
        return result;
    }
}
