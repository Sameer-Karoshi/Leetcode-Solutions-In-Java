class Solution{
    public String reverseVowels(String s) {
        
        String vowels = "";
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||    ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
              vowels = vowels + ch;  
            }
        }
        
        StringBuilder sb = new StringBuilder(vowels);
        vowels = sb.reverse().toString();
        
        String result = "";
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||    ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                result = result + '#';
            }
            else{
                result = result + ch;
            }
        }
        
        String output = "";
        int k = 0;
        for(int i = 0;i < result.length();i++){
            char ch1 = result.charAt(i);
            if(ch1 == '#' && k < vowels.length()){
                char ch2 = vowels.charAt(k);
                output = output + ch2;
                k++;
            }
            else{
                output = output + ch1;
            }
            
        }
        return output;
    }
}