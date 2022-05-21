class Solution {
    public String arrangeWords(String text) {
        String[] str = text.split(" ");
        //for storing lengths
        int[] lenghts = new int[str.length];
        for(int i = 0;i < lenghts.length;i++){
            lenghts[i] = str[i].length();
        }
        Arrays.sort(lenghts);
        String result = "";
        int[] done = new int[str.length];
        for(int i = 0;i < lenghts.length;i++){
            for(int j = 0;j < str.length;j++){
                if(str[j].length() == lenghts[i] && done[j] != 1){
                    done[j] = 1;
                    result = result + str[j] + " ";
                    break;
                }
            }
        }
        result = result.trim();
        result = result.substring(0,1).toUpperCase() + result.substring(1).toLowerCase();
        return result;
    }
}
