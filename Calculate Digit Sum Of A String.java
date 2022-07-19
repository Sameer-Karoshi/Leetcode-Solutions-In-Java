class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            //System.out.println(s);
            int i = 0;
            String temp = "";
            for(i = 0;i <= s.length()-k;i = i+k){
                String str = s.substring(i,i+k);
                //System.out.println(str);
                int val = 0;
                for(int j = 0;j < str.length();j++){
                    val += (int)Character.valueOf(str.charAt(j)) - 48;
                    //System.out.println(val);
                }
                temp += Integer.toString(val);
            }
            if(s.length()%k > 0){
                String str = s.substring(i);
                //System.out.println(str);
                int val = 0;
                for(int j = 0;j < str.length();j++){
                    val += (int)Character.valueOf(str.charAt(j)) - 48;;
                }
                //System.out.println(val);
                temp += Integer.toString(val);
            } 
            s = temp;
        }
        return s;
    }
}
