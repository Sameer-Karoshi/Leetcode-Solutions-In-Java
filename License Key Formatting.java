class Solution {
    public String licenseKeyFormatting(String s, int k) {
        if(k >= s.length() && s.contains("-")){
            return "";
        }
        s = s.toUpperCase();
        String str = "";
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) != '-'){
                str = str + s.charAt(i);
            }
        }
        int div = str.length()/k;
        int rem = str.length()%k;
        String res = str.substring(0,rem) + '-';
        //System.out.println(res);
        for(int i = rem;i < str.length()-k+1;i = i + k){
            res = res + str.substring(i,i+k);
            res = res + '-';
        }
        //System.out.println(res);
        if(res.charAt(0) == '-' && res.charAt(res.length()-1) == '-'){
            res = res.substring(1,res.length()-1);
        }
        else if(res.charAt(0) == '-'){
            res = res.substring(1);
        }
        else if(res.charAt(res.length()-1) == '-'){
            res = res.substring(0,res.length()-1);
        } 
        return res;
    }
}
