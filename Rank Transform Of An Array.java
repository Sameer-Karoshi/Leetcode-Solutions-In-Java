class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i < arr.length;i++){
            set.add(arr[i]);
        }
        //System.out.println(set);
        HashMap<Integer,Integer> map = new HashMap<>();
        int j = 1; // j means rank
        for(int i: set){
          map.put(i,j);
          j++;  
        }
        for(int i = 0;i < arr.length;i++){
            arr[i] = map.get(arr[i]);
        }
        
        return arr;
    }
}
