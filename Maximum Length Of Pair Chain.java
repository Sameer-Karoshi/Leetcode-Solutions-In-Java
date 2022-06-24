class Solution {
    public int findLongestChain(int[][] pairs) {
        //Using comparator we can sort the 2D array also :)
		Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
		int len = 1;
		int val = pairs[0][1]; 
		for(int i=1; i<pairs.length; i++){
			if(pairs[i][0] > val){
				len++;
				val = pairs[i][1];
			}
		}
		return len;
    }
}
