class Solution {
    public String[] findWords(String[] words) {
        String word1 = "qwertyuiop";
        String word2 = "asdfghjkl";
        String word3 = "zxcvbnm";
        
        List<String> list = new ArrayList<>();
        for(int i = 0;i < words.length;i++){
            String temp = words[i].toLowerCase();
            char ch1 = temp.charAt(0);
            if(word1.contains(Character.toString(ch1))){
                int j = 1;
                for(j = 1;j < temp.length();j++){
                    char ch2 = temp.charAt(j);
                    if(!word1.contains(Character.toString(ch2))){
                        break;
                    }
                }
                if(j == temp.length()){
                    list.add(words[i]);
                }
            }
            else if(word2.contains(Character.toString(ch1))){
                int j = 1;
                for(j = 1;j < temp.length();j++){
                    char ch2 = temp.charAt(j);
                    if(!word2.contains(Character.toString(ch2))){
                        break;
                    }
                }
                if(j == temp.length()){
                    list.add(words[i]);
                }
            }
            else if(word3.contains(Character.toString(ch1))){
                int j = 1;
                for(j = 1;j < temp.length();j++){
                    char ch2 = temp.charAt(j);
                    if(!word3.contains(Character.toString(ch2))){
                        break;
                    }
                }
                if(j == temp.length()){
                    list.add(words[i]);
                }
            }
        }
        
      String[] myArray = new String[list.size()];
      return list.toArray(myArray);
    }
}
