class Solution {
    public boolean reorderedPowerOf2(int n) {
        if(n == 1){
            return true;
        }
        String str1 = Integer.toString(n);
        char tempArray1[] = str1.toCharArray();
        Arrays.sort(tempArray1);
        str1 = new String(tempArray1);
        System.out.println(str1);
        for(int i = (int)Math.sqrt(n);i > 0;i--){
            String str2 = Integer.toString((int)Math.pow(2,i));
            char tempArray2[] = str2.toCharArray();
            Arrays.sort(tempArray2);
            str2 = new String(tempArray2);
            System.out.println(str2);
            if(str1.equals(str2)){
                return true;
            }
        }
        return false;
    }
}
