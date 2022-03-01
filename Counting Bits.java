class Solution {
    public int[] countBits(int n) {
        int bits[] = new int[n + 1];
        
        //Integer.bitCount() will return number of one's in any number(binary)
        for (int i = 0; i <= n; i++) {
            bits[i] = Integer.bitCount(i);
        }
        
        return bits;    
    }
}