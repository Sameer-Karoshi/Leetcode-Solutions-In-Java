class Solution {
    public void rotate(int[][] matrix) {
        //first take the transpose of matrix then reverse each row
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i = 0;i < transpose.length;i++){ //row
           for(int j = 0;j < transpose[i].length;j++){ //column
             transpose[j][i] = matrix[i][j];  
           }
        }
        
        //reversing each row
        for(int i = 0;i < transpose.length;i++){ //row
           int k = transpose.length - 1;
           for(int j = 0;j < transpose[i].length;j++){ //column
               matrix[i][j] = transpose[i][k--];
           }
       } 
    }
}
