class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        
        //First we sort the s1
        char temparray1[] = s1.toCharArray();
        Arrays.sort(temparray1);
        String a = new String(temparray1);
        //System.out.println(a);
        
        int length_of_s1 = a.length();
        boolean result = false;
        for(int i = 0;i < s2.length()-length_of_s1+1;i++){
            String temp = s2.substring(i,i+length_of_s1);
            char temparray2[] = temp.toCharArray();
            Arrays.sort(temparray2);
            String b = new String(temparray2);
            if(a.equals(b)){
                result = true;
                break;
            }
        }
      return result;  
        
    }
}
