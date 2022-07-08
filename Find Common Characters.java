class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        String str = words[0];
        for(int i = 0;i < str.length();i++){
            int j = 1;
            for(j = 1;j < words.length;j++){
                if(words[j].contains(Character.toString(str.charAt(i)))){
                    //System.out.println(words[j]);
                    int index = words[j].indexOf(str.charAt(i));
                    words[j] = words[j].substring(0,index) + "$" + words[j].substring(index+1);
                }
                else{
                    break;
                }
            }
            if(j == words.length){
                list.add(Character.toString(str.charAt(i)));
            }
        }
        return list;
    }
}
