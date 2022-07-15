class Solution {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        for(int i = 1;i*i <= area;i++){
            if(area%i == 0){
                //res[1] = width
                res[1] = i;
                //res[0] = height
                res[0] = area/res[1];
            }
        }
        return res;
        
    }
}
