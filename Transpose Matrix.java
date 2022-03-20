class Solution {
    public int[][] transpose(int[][] matrix) {
       int[][] transpose = new int[matrix[0].length][matrix.length];
        
       for(int i = 0;i < matrix.length;i++){ //row
           for(int j = 0;j < matrix[i].length;j++){ //column
             transpose[j][i] = matrix[i][j];  
           }
       }
       return transpose;
    }
}