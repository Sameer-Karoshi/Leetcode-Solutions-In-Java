class Solution {
    public int minDeletionSize(String[] strs) {
        int res = 0;
        for(int i = 0;i < strs[0].length();i++){
            for(int j = 0;j < strs.length-1;j++){
                if(strs[j].charAt(i) > strs[j+1].charAt(i)){
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
