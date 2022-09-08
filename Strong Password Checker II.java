class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8){
            return false;
        }
        int lowerchars = 0;
        int upperchars = 0;
        int specialchars = 0;
        int digit = 0;
        String specialcharsstr = "!@#$%^&*()-+";
        for(int i = 0;i < password.length();i++){
            if(i != password.length()-1 && password.charAt(i) == password.charAt(i+1)){
                return false;
            }
            else if(Character.isDigit(password.charAt(i))){
                digit += 1;
            }
            else if(Character.isLowerCase(password.charAt(i))){
                lowerchars += 1;
            }
            else if(Character.isUpperCase(password.charAt(i))){
                upperchars += 1;
            }
            else if(specialcharsstr.contains(Character.toString(password.charAt(i)))){
                specialchars += 1;
            }
        }
        if(specialchars >= 1 && lowerchars >= 1 && upperchars >= 1 && digit >= 1){
            return true;
        }
        return false;
    }
}
