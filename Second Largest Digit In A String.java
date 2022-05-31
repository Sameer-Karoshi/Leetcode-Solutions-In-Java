class Solution {
    public int secondHighest(String s) {
        int firstmax = 0;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int temp = Character.getNumericValue(ch);
                if(temp > firstmax){
                    firstmax = temp;
                }
            }
        }
        
        int secondmax = -1;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int temp = Character.getNumericValue(ch);
                if(temp > secondmax && temp < firstmax){
                    secondmax = temp;
                }
            }
        }
        return secondmax;
    }
}
