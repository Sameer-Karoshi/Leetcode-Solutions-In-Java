class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row*col > r*c || row*col < r*c){
            return mat;
        }
        int[] arr = new int[r*c];
        int k = 0;
        for(int i = 0;i < mat.length;i++){
            for(int j = 0;j < mat[i].length;j++){
                arr[k++] = mat[i][j];
            }
        }
        k = 0; 
        int[][] res = new int[r][c];
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                res[i][j] = arr[k++];
            }
        }
        return res;
    }
}
