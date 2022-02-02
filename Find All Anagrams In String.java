import java.util.Arrays;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int len_of_p = p.length();
        
        char arr1[] = p.toCharArray();
        Arrays.sort(arr1);
        String a = new String(arr1);
        
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int i = 0;i <= s.length() - len_of_p;i++){
            
            String str = s.substring(i,i + len_of_p);
            char arr2[] = str.toCharArray();
            
            Arrays.sort(arr2);
            
            String b = new String(arr2);
            
            if(a.equals(b)){
               output.add(i); 
            }
                   
        }
        
        
    return output;
    }
}