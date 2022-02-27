class Solution {
    public int[] replaceElements(int[] arr) {
        int[] output = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            int max = 0;
            if(i == arr.length-1){
                max = -1;
                output[i] = max;
            }
            else{
                max = arr[i+1];
                for(int j = i+2;j < arr.length;j++){
                    if(arr[j] > max){
                        max = arr[j];
                    }
                }
                output[i] = max;
            }
        }
        return output;
    }
}