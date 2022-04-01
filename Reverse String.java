class Solution {
    public void reverseString(char[] s) {
        char[] result = new char[s.length];
        int j = 0;
        for(int i = s.length-1;i > -1;i--){
          result[j] = s[i];
          j++;
        }
        
        for(int i = s.length-1;i > -1;i--){
          s[i] = result[i]; 
        }
    }
}