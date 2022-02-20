class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        int result = intervals.length;
        //System.out.println(result);
        for(int i = 0;i < intervals.length;i++){
            for(int j = 0;j<intervals.length;j++){
                if(j != i){
                if(intervals[i][0] >= intervals[j][0] && intervals[i][1] <= intervals[j][1])                    {
                  result--;
                    break;
                }    
              }
            }
        }
        return result;
        
    }
}