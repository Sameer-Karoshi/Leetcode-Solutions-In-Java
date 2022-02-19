class Solution {
    public String longestCommonPrefix(String[] strs) {
       
        String result = "";
        if(strs.length == 1){
            result = strs[0];
        }
        else{
            //First we will find the length of minimun size string
            int min = strs[0].length();
            //System.out.println(min);
            for(int i = 1;i < strs.length;i++){
                if(strs[i].length() < min){
                    min = strs[i].length();
                }
            }

            System.out.println(min);

            for(int i = 0;i < min;i++){
                String sbs = strs[0].substring(0,i+1);
                int j;
                for(j = 1;j < strs.length;j++){
                     if(!strs[j].startsWith(sbs)){
                         break;
                     }
                }
                if(j == strs.length){
                    result = sbs;
                }
            }
        }
     return result;   
    }
}