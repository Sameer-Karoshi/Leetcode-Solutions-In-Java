class Solution {
    public String reverseOnlyLetters(String s) {
       String temp = "";
       for(int i = 0;i < s.length();i++){
           char ch = s.charAt(i);
           if(Character.isLetter(ch)){
               temp = temp + ch;
           }
       }
        
      StringBuilder SB = new StringBuilder(temp);
      String temp2 = SB.reverse().toString();
      String result = "";
      int j = 0;
      for(int i = 0;i < s.length();i++){
          char ch = s.charAt(i);
          if(Character.isLetter(ch)){
              result = result + temp2.charAt(j);
              j++;
          }
          else{
              result = result + ch;
          }
      }
        return result;
    }
}
