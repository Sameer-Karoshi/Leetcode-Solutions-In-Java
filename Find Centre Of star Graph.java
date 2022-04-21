class Solution {
    public int findCenter(int[][] edges) {
      
      int i = 1;
      int val1 = edges[0][0];
      int val2 = edges[0][1];
      int result = 0;
      for(i = 1;i < edges.length;i++){
        if(val1 == edges[i][0] || val1 == edges[i][1]){
            result = val1;
        }
          else{
              result = val2;
          }
      }
        if(i == edges.length-1){
            return result;
        }
       return result; 
    }
}
