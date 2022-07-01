class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        // Memory limit exceeds :(
      /* //lets create one 2D array
        int[][] arr = new int[rocks.length][rocks.length];
        for(int i = 0;i < rocks.length;i++){
            //first is capacity
            arr[i][0] = capacity[i];
            //second is rocks
            arr[i][1] = rocks[i];
        }
        Arrays.sort(arr,(a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
        for(int i = 0;i < arr.length;i++){
            //System.out.println(arr[i][0] + " " + arr[i][1]);
        }
        for(int i = 0;i < arr.length;i++){
            if(additionalRocks >= (arr[i][0]-arr[i][1]) && additionalRocks > 0){
                additionalRocks = additionalRocks - (arr[i][0]-arr[i][1]);
                arr[i][1] = arr[i][0];
            }
            else{
                break;
            }
        }
        System.out.println("After");
        for(int i = 0;i < arr.length;i++){
           // System.out.println(arr[i][0] + " " + arr[i][1]);
        }
        int res = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i][0] == arr[i][1]){
                res++;
            }
        }
        return res;
        */
        // difference array to know how many rocks we can fill to make it full capacity
        int total=additionalRocks;
        int c=0;
        int diff[] = new int[capacity.length];
        
        for(int i=0;i<capacity.length;i++){
            diff[i]=capacity[i]-rocks[i];
        }
        //sort the array 
        Arrays.sort(diff);
        
        // to fill most of the bags, it will be benificial for us to choose the one with the lowest difference
         for(int i=0;i<capacity.length;i++){
            if(total>=diff[i]){
                total-=diff[i];
                c++;
            }
             else{
                 break;
             }
        }
        return c;
    }
}
