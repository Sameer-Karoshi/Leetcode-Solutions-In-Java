class Solution {
    public int getLucky(String s, int k) {
        String num = "";
        for(int i = 0;i < s.length();i++){
            num = num + (s.charAt(i)-96);
        }
        System.out.println(num);
        int res = 0;
        while(k > 0){
            int temp = 0;
            for(int i = 0;i < num.length();i++){
                int val = Character.getNumericValue(num.charAt(i));
                temp = temp + val;
            }
            res = temp;
            k--;
            num = Integer.toString(res);
        } 
        return res;
    }
}
