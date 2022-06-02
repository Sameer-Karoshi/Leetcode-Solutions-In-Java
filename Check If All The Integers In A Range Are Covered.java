class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int i = left;i < right + 1;i++){
            boolean present = false;
            for(int j = 0;j < ranges.length;j++){
                if(i >= ranges[j][0] && i <= ranges[j][1]){
                   present = true;
                    break;
                }
            }
            if(!present){
                return false;
            }
        }
        return true;
    }
}
