class Solution {
    public boolean isPalindrome(String s) {
        
        //Convert string to lower case
        String S1 = s.toLowerCase();
        //System.out.println(S1);
        S1 = S1.replaceAll("\\p{Punct}","");
        S1 = S1.replaceAll(" ","");
        //System.out.println(S1);
        StringBuilder SB = new StringBuilder(S1);
        String S2 = SB.reverse().toString();
        
        if(S1.equals(S2)){
            return true;
        }
        else{
            return false;
        }
    }
}