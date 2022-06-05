class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        for(int i = 0;i < words.length;i++){
            int j = 0;
            for(j = 0;j < words[i].length();j++){
                char ch = words[i].charAt(j);
                //System.out.println(ch);
                if(!allowed.contains(Character.toString(ch))){
                    break;
                }
            }
            if(j == words[i].length()){
                //System.out.println(true);
                res++;
            }       
        }
        return res;
    }
}
