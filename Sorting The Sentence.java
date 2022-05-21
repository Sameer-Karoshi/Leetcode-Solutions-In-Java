class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String result = "";
        for(int i = 1;i < 10;i++){
            for(int j = 0;j < str.length;j++){
                String num = Integer.toString(i);
                //System.out.println(num);
                //System.out.println(str[j]);
                if(str[j].contains(num)){
                    result = result + str[j].substring(0,str[j].length()-1) + " ";
                }
            }
        }
        return result.trim();
    }
}
