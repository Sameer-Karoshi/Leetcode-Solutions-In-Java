class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        
        for(int i = 0;i < arr1.length;i++){
            if(map1.containsKey(arr1[i])){
                int val = map1.get(arr1[i]);
                val++;
                map1.put(arr1[i],val);
            }
            else{
                map1.put(arr1[i],1);
            }
        }
        for(int i = 0;i < arr2.length;i++){
            if(map2.containsKey(arr2[i])){
                int val = map2.get(arr2[i]);
                val++;
                map2.put(arr2[i],val);
            }
            else{
                map2.put(arr2[i],1);
            }
        }
        //System.out.println(map1);
        //System.out.println(map2);
        List<String> res = new ArrayList<>();
        for(int i = 0;i < arr1.length;i++){
            if(map1.get(arr1[i]) == 1 && !map2.containsKey(arr1[i])){
                res.add(arr1[i]);
            }
        }
        for(int i = 0;i < arr2.length;i++){
            if(map2.get(arr2[i]) == 1 && !map1.containsKey(arr2[i])){
                res.add(arr2[i]);
            }
        }
        String[] result = new String[res.size()];
        res.toArray(result);
        return result;
    }
}
