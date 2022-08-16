class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] res = new int[grid.length-2][grid.length-2];
        for(int i = 0;i < res.length;i++){
            for(int j = 0;j < res.length;j++){
                int max = Integer.MIN_VALUE;
                for(int k = i;k < i + 3;k++){
                    for(int l = j;l < j + 3;l++){
                        if(grid[k][l] > max){
                            max = grid[k][l];
                        }
                    }
                }
                res[i][j] = max;
            }
        }
        return res;
    }
}
