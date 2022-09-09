class Solution {
    public int numberOfWeakCharacters(int[][] pro) {
        int res = 0;
        //if a[0] == b[0] then sort according to second value in ascending order
        //else sort according to first value in descending order
        Arrays.sort(pro, (a,b) -> (a[0]!=b[0]) ? b[0]-a[0] : a[1]-b[1]);
        int max = Integer.MIN_VALUE;
        for(int[] e : pro){
            if(e[1] < max) res++;
            max = Math.max(max,e[1]);
        }
        
        return res;
    }
}
