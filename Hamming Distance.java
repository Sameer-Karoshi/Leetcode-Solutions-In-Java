class Solution {
    public int hammingDistance(int x, int y) {
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);
        
        String zeros = "0";
        if(a.length() > b.length()){
            b = zeros.repeat(a.length()-b.length()) + b;
        }
        else if(b.length() > a.length()){
            a = zeros.repeat(b.length()-a.length()) + a;
        }
        //System.out.println(a + " " + b);
        int res = 0;
        for(int i = 0;i < a.length();i++){
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);
            if(ch1 != ch2){
                res++;
            }
        }
        return res;
        
    }
}
