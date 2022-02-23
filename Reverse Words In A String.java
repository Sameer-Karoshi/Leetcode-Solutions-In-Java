class Solution {
    public String reverseWords(String s) {
        
    //First reverse the string using StringBuilder Class
     StringBuilder Sb = new StringBuilder(s);
     String reversed = Sb.reverse().toString();
        
     String[] str = reversed.split(" ");
     
        String result = "";
        for(int i = 0;i < str.length;i++){
            StringBuilder sbr = new StringBuilder(str[i]);
            String temp = sbr.reverse().toString();
            result = result + temp + " ";
        }
        
        //This inbuily function will remove extra spaces from string 
        result = result.replaceAll("\\s+"," ").trim();
        return result;
    }
}