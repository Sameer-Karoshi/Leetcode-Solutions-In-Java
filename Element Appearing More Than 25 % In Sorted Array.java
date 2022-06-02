class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            map.put(arr[i],0);
        }
        
        for(int i = 0;i < arr.length;i++){
            int val = map.get(arr[i]);
            val++;
            map.put(arr[i],val);
        }
        
        int maxval = -1;
        for(int i = 0;i < arr.length;i++){
           int val = map.get(arr[i]);
           if(val > maxval){
               maxval = val;
           }
        }
        
        int res = -1;
        for(int i = 0;i < arr.length;i++){
           int val = map.get(arr[i]);
           if(val == maxval){
               res = arr[i];
           }
        }
        return res;
        
    }
}
