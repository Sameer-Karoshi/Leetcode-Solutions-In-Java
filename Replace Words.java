class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        //using lamba expressions we can sort the strings based on their length :)
        Collections.sort(dictionary, (a, b)->Integer.compare(a.length(), b.length()));
        String[] result = sentence.split(" ");
        for(int i = 0;i < result.length;i++){
            for(int j = 0;j < dictionary.size();j++){
                if(result[i].startsWith(dictionary.get(j))){
                    result[i] = dictionary.get(j);
                    break;
                }
            }
        }
        String ans = "";
        for(int i = 0;i < result.length;i++){
            ans = ans + result[i] + " ";
        }
        return ans.trim();
    }
}
