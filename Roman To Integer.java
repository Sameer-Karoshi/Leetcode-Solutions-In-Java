class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int val1 = 0,val2 = 0;
        
        for(int i = 0; i < s.length(); i++){
            val1 = IntValofRoman(s.charAt(i));
            
            if(i + 1 < s.length()){
                val2 = IntValofRoman(s.charAt(i+1));
            }
            
            if(val1 >= val2){  // Test Case: 'VI' --> 5 + 1 = 6
                total += val1;
            }
            else{              //Test Case: 'IX' --> 10 - 1 = 9
                total -= val1;
            }
        }
        return total;
    }
    
    public int IntValofRoman(char ch){
        if(ch == 'I'){
            return 1;
        }
        else if(ch == 'V'){
            return 5;
        }
        else if(ch == 'X'){
            return 10;
        }
        else if(ch == 'L'){
            return 50;
        }
        else if(ch == 'C'){
            return 100;
        }
        else if(ch == 'D'){
            return 500;
        }
        else if(ch == 'M'){
            return 1000;
        }
        
        return -1;
    }
}