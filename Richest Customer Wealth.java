import java.util.*;
class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int[] arr = new int[accounts.length];
        
        for(int i = 0;i < accounts.length;i++){
            
            int sum = 0;
            for(int j = 0; j < accounts[i].length;j++){
                sum = sum + accounts[i][j];
            }
            
            arr[i] = sum;
        }
        
        
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        return max;
        
    }
}