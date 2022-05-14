class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        
        int diff = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length-1;i++){
            diff = Math.min(diff,arr[i+1]-arr[i]);
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i < arr.length-1;i++){
            if(diff == arr[i+1]-arr[i]){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                result.add(list);
            }
        }
        return result;
    }
}
