class Solution {
    public int balancedStringSplit(String s) {
       if (s.length() == 0){
           return 0;
       }
        int result = 0;
        int R = 0;
        int L = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                R++;
            } 
            else if (c == 'L') {
                L++;
            }
            if(R == L) {
                result++;
                R = 0;
                L = 0;
            }
        }
        return result;
    }
}
