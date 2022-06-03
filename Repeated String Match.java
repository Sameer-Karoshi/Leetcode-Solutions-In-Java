class Solution {
    public int repeatedStringMatch(String a, String b) {
        String temp = "";
        for(int i = 1;i <= (b.length()/a.length()) + 2;i++){
            temp = a.repeat(i);
            if(temp.contains(b)){
                return i;
            }
        }
        return -1;
    }
}
