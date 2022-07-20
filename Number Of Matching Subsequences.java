/*class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int result = 0;
        for(int i = 0;i < words.length;i++){
            if(s.contains(words[i])){
                    result++;
                    continue;
                }
            else{
                String temp = s;
                int previndex = -2;
                int currindex = -1;
                int j = 0;
                for(j = 0;j < words[i].length();j++){
                    if(temp.contains(Character.toString(words[i].charAt(j)))){
                         currindex = s.indexOf(Character.toString(words[i].charAt(j)));
                         //System.out.println(currindex);

                         if(currindex > previndex && currindex != -1){
                             temp = temp.substring(0,currindex) + "@" + temp.substring(currindex);
                         }
                         else{
                             break;
                         }
                        previndex = currindex;
                    }
                    else{
                        break;
                    }
                }
                if(j == words[i].length()){
                    result++;
                }
                //System.out.println(temp);
            }
        }
        return result;
        
    }
}
*/
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int index = -1;
        int count = 0;
        boolean SubSeq = true;
        
        for(String word : words) {
            SubSeq = true;
            index = -1;
            for(char c : word.toCharArray()) {
                index = s.indexOf(c, index + 1);
                if (index == -1) {
                    SubSeq = false;
                    break;
                }
            }
            if(SubSeq)
                count++;
        }
        return count;
    }
}
