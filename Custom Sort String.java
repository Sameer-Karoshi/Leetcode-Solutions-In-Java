class Solution {
    public String customSortString(String order, String s) {
        String ans = "";
        for(int i=0;i<order.length();i++){
            String str = Character.toString(order.charAt(i));
            while(s.contains(str)){
                s=s.replaceFirst(str,"");
                ans=ans+str;
            }
        }
        return ans+s;
    }
}
