class Solution {
    public int maxSum(int[][] grid) {
        int result = 0;
        for(int i = 0;i < grid.length - 2;i++){
            int sum = 0;
            for(int j = 0;j < grid[i].length - 2;j++){
                sum = grid[i][j] + grid[i][j+1] + grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
                result = Math.max(result,sum);
                sum = 0;
            }
        }
        return result;
    }
}
