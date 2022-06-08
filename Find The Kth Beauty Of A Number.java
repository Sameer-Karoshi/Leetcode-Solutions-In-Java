class Solution {
    public int divisorSubstrings(int num, int k) {
        int res = 0;
        String str = Integer.toString(num);
        for(int i = 0;i < str.length()-k+1;i++){
            if(Integer.parseInt(str.substring(i,i+k)) != 0 && num%Integer.parseInt(str.substring(i,i+k)) == 0){
                res++;
            }
        }
        return res;
    }
}
