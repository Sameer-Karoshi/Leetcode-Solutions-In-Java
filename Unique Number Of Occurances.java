class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         HashSet<Integer> set=new HashSet(); 
         for(int i = 0;i < arr.length;i++){
             set.add(arr[i]);
         }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer i: arr){
            int freq = 0;
            for(int j = 0;j < arr.length;j++){
                if(i == arr[j]){
                    freq++;
                }
            }
            map.put(i,freq);
        }
        int[] array = new int[map.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            array[i++] = (int)e.getValue();
        Arrays.sort(array);
        for(int j = 0;j < array.length-1;j++){
            if(array[j] == array[j+1]){
                return false;
            }
        }
        return true;
    }
}
