class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i < k;i++){
           int min_distance = Integer.MAX_VALUE;
           int value = Integer.MAX_VALUE;
           int j = 0;
           int index = 0;
           for(j = 0;j < arr.length;j++){
              if(Math.abs(arr[j]-x) < min_distance && arr[j] != Integer.MAX_VALUE){
                  min_distance = Math.abs(arr[j]-x);
                  //System.out.println(min_distance);
                  value = arr[j];
                  index = j;
              } 
           }
            result.add(arr[index]);
            arr[index] = Integer.MAX_VALUE;
        }
        Collections.sort(result);
        return result;
    }
}
