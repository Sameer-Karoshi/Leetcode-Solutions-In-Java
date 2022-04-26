class Solution {
    public String[] findRelativeRanks(int[] score) {
        
       String [] answer = new String[score.length];
        
        Map<Integer, Integer> valueIdx = new TreeMap<>(Collections. reverseOrder());
        for(int i=0; i<score.length; i++) {
            valueIdx.put(score[i], i);
        }
        int rank = 1;
        for (Integer key : valueIdx.keySet()) {
            if(rank == 1) {
                answer[valueIdx.get(key)] = "Gold Medal";
            } else if(rank == 2) {
                answer[valueIdx.get(key)] = "Silver Medal";
            } else if(rank == 3) {
                answer[valueIdx.get(key)] = "Bronze Medal";
            } else 
                answer[valueIdx.get(key)] = rank + "";
            
            rank ++;
        }
                
    return answer;
        
    }
}
