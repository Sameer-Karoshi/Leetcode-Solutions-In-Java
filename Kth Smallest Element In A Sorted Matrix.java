class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       int[] result = new int[matrix.length*matrix.length];
       int m = 0;
       for(int i = 0;i < matrix.length;i++){
           for(int j = 0;j < matrix[i].length;j++)
           {
               result[m++] = matrix[i][j];
           }
       }
      Arrays.sort(result);
      return result[k-1];
    }
}
