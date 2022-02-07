class Solution {
    public char findTheDifference(String s, String t) {
        
       char[] a = s.toCharArray();
       char[] b = t.toCharArray();
        
        int total_of_a = 0;
        
        for(int i = 0;i < a.length;i++){
            int ascii = a[i];
            
            total_of_a = total_of_a + ascii;
        }
        
        int total_of_b = 0;
        for(int i = 0;i < b.length;i++){
            int ascii = b[i];
            
            total_of_b = total_of_b + ascii;
        }
        
        char diff = (char)(total_of_b - total_of_a);
        return diff;
        
    }
}