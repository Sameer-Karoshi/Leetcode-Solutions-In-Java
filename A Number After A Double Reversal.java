class Solution {
    public boolean isSameAfterReversals(int num) {
        StringBuilder sb1 = new StringBuilder(Integer.toString(num));
        String str1 = sb1.reverse().toString();
        int rev1 = Integer.parseInt(str1);
        
        StringBuilder sb2 = new StringBuilder(Integer.toString(rev1));
        String str2 = sb2.reverse().toString();
        int rev2 = Integer.parseInt(str2);
        return num == rev2;
        
    }
}
