class Solution {
    public String replaceDigits(String s) {
        for(int i = 1;i < s.length();i = i + 2){
            char ch = (char)(s.charAt(i-1) + Integer.parseInt(String.valueOf(s.charAt(i))));
            s = s.substring(0,i) + Character.toString(ch) + s.substring(i+1);
        }
        return s;
    }
}
