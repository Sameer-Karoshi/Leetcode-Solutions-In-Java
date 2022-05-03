class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length == 1){
            return cost[0];
        }
        else if(cost.length == 2){
            return cost[0] + cost[1];
        }
        Arrays.sort(cost);
        int[] result = new int[cost.length];
        int j = 0;
        for(int i = cost.length-1;i > -1;i--){
            result[j++] = cost[i];
        }
        int res = 0;
        for(int i = 0;i < result.length;i++){
            if((i+1)%3 != 0){
                res = res + result[i];
            }
        }
        return res;
    }
}
