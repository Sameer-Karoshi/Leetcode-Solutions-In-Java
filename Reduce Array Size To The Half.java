class Solution {
    public int minSetSize(int[] arr) {
        //creating one hashmap
        //In hashmap putted key as a number and value as a frequency of number
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                val++;
                map.put(arr[i],val);
            }
            else{
                map.put(arr[i],1);
            }
        }
        //created freq array
        int[] freq = new int[map.size()];
        int j = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            freq[j++] = entry.getValue();
        }
        Arrays.sort(freq);
        int arrsize = arr.length;
        int res = 0;
        for(int i = freq.length-1;i > -1;i--){
            arrsize -= freq[i];
            res++;
            if(arrsize <= arr.length/2){
                break;
            }
        }
        return res;
    }
}
