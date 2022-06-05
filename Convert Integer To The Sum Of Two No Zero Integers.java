class Solution {
    public int[] getNoZeroIntegers(int n) {
        int start = 1;
        int end = n-1;
        
        int[] res = new int[2];
        while(start > 0 && end > 0){
            Set<Character> set = new HashSet<>();
            String str1 = Integer.toString(start);
            String str2 = Integer.toString(end);
            for(int i = 0;i < str1.length();i++){
                set.add(str1.charAt(i));
            }
            for(int i = 0;i < str2.length();i++){
                set.add(str2.charAt(i));
            }
            if(!set.contains('0')){
                res[0] = start;
                res[1] = end;
                break;
            }
            else{
                start++;
                end--;
            }
        }
        return res;
    }
}
