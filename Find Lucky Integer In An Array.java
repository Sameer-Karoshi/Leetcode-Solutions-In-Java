class Solution {
    public int findLucky(int[] arr) {
        HashSet<Integer> set=new HashSet(); 
        for(int i = 0;i < arr.length;i++){
            set.add(arr[i]);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        //System.out.println(set);
        for(Integer i: set){
            int freq = 0;
            for(int j = 0;j < arr.length;j++){
                if(i == arr[j]){
                    freq++;
                }
            }
           map.put(i,freq); 
        }
        
        //System.out.println(map);
        int result = -1;
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getKey() == e.getValue()){
                result = e.getKey();
            }
        }
       return result;     
    }
}
