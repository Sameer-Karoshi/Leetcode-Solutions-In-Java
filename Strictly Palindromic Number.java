class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2;i < n - 1;i++){
            String str1 = Integer.toString(n,i);
            String str2 = (new StringBuilder(str1)).reverse().toString();
            if (!str1.equals(str2)){
                return false;
            }
        }
        return true;
    }
}
