class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int result = 0;
        int max = Math.max(v1.length,v2.length);
        
        int[] array1 = new int[max];
        int[] array2 = new int[max];
        
        //fill both arrays with 0 :)
        for(int i = 0;i < max;i++){
           array1[i] = 0;
           array2[i] = 0;
        }
        
        for(int i = 0;i < v1.length;i++){
            array1[i] = Integer.parseInt(v1[i]);
        }
        for(int i = 0;i < v2.length;i++){
            array2[i] = Integer.parseInt(v2[i]);
        }
        
        for(int i = 0;i < max;i++){
            if(array1[i] > array2[i]){
               result = 1;
                break;
            }
            else if(array2[i] > array1[i]){
                result = -1;
                break;
            }
            else{
                result = 0;
            }
        }
        return result;
        
    }
}