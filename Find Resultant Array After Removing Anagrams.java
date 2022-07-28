class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i = 0;i < words.length;i++){
            list.add(words[i]);
        }
        
        for(int i = 1;i < list.size();i++){
            char[] ch1 = list.get(i-1).toCharArray();
            char[] ch2 = list.get(i).toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            String s1 = new String(ch1);
            String s2 = new String(ch2);
            if(s1.equals(s2)){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
