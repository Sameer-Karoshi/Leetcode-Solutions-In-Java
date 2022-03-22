class Solution {
    public String getSmallestString(int n, int k) {
       char[] result = new char[n]; 
       //k means total numeric value and n is size of string
        for (int i = 0; i < n; i++) {
            result[i] = 'a';//initialize all array element with 'a'
            k--;
        }
        
        int numValue;
        while (k > 0) {
            numValue = Math.min(25, k);
            result[--n] += numValue;
            k -= numValue;
        }
        return String.valueOf(result);
    }
}