class Solution {
    public String largestGoodInteger(String num) {
        String[] possible = {"000","111","222","333","444","555","666","777","888","999"};
        for(int i = 9;i >= 0;i--){
            if(num.indexOf(possible[i]) != -1){
                return possible[i];
            }
        }
        return "";          
    }
}
