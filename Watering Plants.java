class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int res = 0;
        int temp = capacity;
        for(int i = 0;i < plants.length;i++){
            if(plants[i] <= temp){
                res++;
                temp = temp - plants[i];
            }
            else{
                res = res + 2*i + 1;
                temp = capacity;
                temp = temp - plants[i];
            }
            //System.out.println(res);
        }
        return res;
    }
}
