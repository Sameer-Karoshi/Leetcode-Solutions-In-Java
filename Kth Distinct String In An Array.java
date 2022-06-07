class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> result = new ArrayList<>();
        for(int i = 0;i < arr.length;i++){
            int j = 0;
            for(j = 0;j < arr.length;j++){
                if(arr[i].equals(arr[j]) && i != j){
                    break;
                }
            }
            if(j == arr.length){
                result.add(arr[i]);
            }
        }
        //System.out.println(result);
        if(k > result.size()){
            return "";
        }
        return result.get(k-1);
    }
}
