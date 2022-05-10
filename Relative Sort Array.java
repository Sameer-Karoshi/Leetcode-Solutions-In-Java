class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
       List<Integer> list1 = new ArrayList<>();
        for(int i = 0;i < arr2.length;i++){
            for(int j = 0;j < arr1.length;j++){
                if(arr2[i] == arr1[j]){
                    list1.add(arr1[j]);
                }
            }
        }
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0;i < arr1.length;i++){
            boolean found = false;
            for(int j = 0;j < arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                list2.add(arr1[i]);
            }
        }
        
        Collections.sort(list2);
        int[] result = new int[arr1.length];
        int m = 0;
        for(int i = 0;i < list1.size();i++){
            result[m++] = list1.get(i);
        }
         for(int i = 0;i < list2.size();i++){
            result[m++] = list2.get(i);
        }
        return result;
        
    }
}
