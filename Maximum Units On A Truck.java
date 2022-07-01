class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(a[1], b[1]));
        /*for(int i = 0;i < boxTypes.length;i++){
            System.out.println(boxTypes[i][0] + " " + boxTypes[i][1]);
        }
        */
        int res = 0;
        for(int i = boxTypes.length-1;i > -1;i--){
            if(truckSize != 0){
                if(truckSize >= boxTypes[i][0]){
                    res = res + boxTypes[i][0]*boxTypes[i][1];
                    truckSize = truckSize - boxTypes[i][0];
                }
                else{
                    res = res + truckSize*boxTypes[i][1];
                    truckSize = 0;
                }
            }
            else{
                break;
            }
        }
        return res;
    }
}
