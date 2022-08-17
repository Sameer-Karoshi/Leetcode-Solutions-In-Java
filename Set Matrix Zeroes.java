class Solution {
    public void setZeroes(int[][] matrix) {
        //lets create new matrix
       int[][] res = new int[matrix.length][matrix[0].length];
        //copying matrix to result
        for(int i = 0;i < matrix.length;i++){
          for(int j = 0;j < matrix[i].length;j++){
               res[i][j] = matrix[i][j];
          }
       }
       for(int i = 0;i < matrix.length;i++){
           for(int j = 0;j < matrix[i].length;j++){
               if(matrix[i][j] == 0){
                   SetRowColZero(res,i,j);
               }
           }   
       }
      //result is available in res array
      //but we have to make changes in orignal array 
      //so again copying res array to orignalg array
      for(int i = 0;i < matrix.length;i++){
          for(int j = 0;j < matrix[i].length;j++){
              matrix[i][j] = res[i][j];
          }
      }
       
    }
     public void SetRowColZero(int[][] matrix,int row,int col){
         //setting row values to zero
           for(int j = 0; j < matrix[0].length;j++){
               matrix[row][j] = 0;
           }
           //setting col values to zero
           for(int j = 0; j < matrix.length;j++){
               matrix[j][col] = 0;
           } 
    }
}
