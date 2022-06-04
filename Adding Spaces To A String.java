class Solution {
    public String addSpaces(String s, int[] spaces) {
       /* String result = "";
        for(int i = 0;i < spaces.length;i++){
            if(i == 0){
                result = result + s.substring(0,spaces[0]) + " ";
                //System.out.println(result);
            }  
            else if(i == spaces.length-1){
                result = result + s.substring(spaces[i-1],spaces[i]) + " ";
                //System.out.println(result);
            }
            else{
                result = result + s.substring(spaces[i-1],spaces[i]) + " ";
                //System.out.println(result);
            }
        }
        return result + s.substring(spaces[spaces.length-1]);
        */
        StringBuilder SB = new StringBuilder(s);
        for(int i = 0;i < spaces.length;i++){
            SB.insert(i+spaces[i]," ");
        }
        return SB.toString();
    }
}
