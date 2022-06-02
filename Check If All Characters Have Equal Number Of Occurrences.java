class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,0);
        }
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            int val = map.get(ch);
            val++;
            map.put(ch,val);
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < s.length();i++){
            set.add(map.get(s.charAt(i)));
        }
        return set.size() == 1;
    }
}
