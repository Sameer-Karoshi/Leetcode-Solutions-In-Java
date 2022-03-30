class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        for(int i = 0;i < matrix.length;i++){ //row
            for(int j = 0;j < matrix[i].length;j++){ //column
                if(matrix[i][j] == target){
                    result = true;
                    break;
                }
                
            }
            
            if(result){
                break;
            }
        }
     return result;
    }
}