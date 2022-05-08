class Solution {
    public int firstUniqChar(String s) {
        for(int i = 0;i < s.length();i++){
            char ch1 = s.charAt(i);
            int j = 0;
            for(j = 0;j < s.length();j++){
                char ch2 = s.charAt(j);
                if(i != j && ch1 == ch2){
                   break; 
                }
            }
            if(j == s.length()){
                return i;
            }
        }
        return -1;
    }
}
