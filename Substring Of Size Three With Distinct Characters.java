class Solution {
    public int countGoodSubstrings(String s) {
        int res = 0;
        for(int i = 0;i < s.length() - 2;i++){
            String str = s.substring(i,i+3);
            Set<Character> set = new HashSet<>();
            for(int j = 0;j < 3;j++){
                set.add(str.charAt(j));
            }
            if(set.size() == 3){
                res++;
            }
        }
        return res;
    }
}
