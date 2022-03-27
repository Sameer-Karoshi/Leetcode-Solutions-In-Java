class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] array1 = new int[mat.length];
        for(int i = 0;i < mat.length;i++){
            int count = 0;
            for(int j = 0;j < mat[i].length;j++){
                count = count + mat[i][j];
            }
           // System.out.println(count);
            array1[i] = count;
            //System.out.println(array1[i]);
        }
        
        int[] result = new int[k];
        for(int i = 0;i < k;i++){
           int min = 100;
           int minindex = 0;
            for(int j = 0;j < array1.length;j++){
                if(array1[j] < min){
                    min = array1[j];
                    minindex = j;
                } 
            }
            result[i] = minindex;
            array1[minindex] = 100;
        }
        
       return result; 
          
    }
}