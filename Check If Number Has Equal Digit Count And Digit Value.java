class Solution {
    public boolean digitCount(String num) {
        int[] freq = new int[10];
        for(int i = 0; i < num.length();i++){
            int n = Character.getNumericValue(num.charAt(i));
            freq[n]++;
        }
        
        for(int i = 0;i < num.length();i++){
            if(freq[i] != Character.getNumericValue(num.charAt(i))){
                return false;
            }
        }
        return true; 
    }
}
