class Solution {
    public String greatestLetter(String s) {
        String res = "";
        char max = 'A';
        boolean flag = false;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch) && s.contains(Character.toString(ch).toLowerCase())){
                if(ch >= max){
                    flag = true;
                    max = ch;
                }
            }
        }
        if(flag){
            return "" + max;
        }
        return "";
    }
}
