class Solution {
    public int titleToNumber(String columnTitle) {
        
        int result = 0;
        for(int i = 0;i < columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            int position = ch - 65 + 1;
            if(i == 0){
                result = position;
            }
            else{
                result = result*(26) + position;
            }
        }
        return result;
    }
}