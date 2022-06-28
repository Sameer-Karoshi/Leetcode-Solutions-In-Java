class Solution {
    public int minDeletions(String s) {
        //First create hashmap and count freq of all characters in it
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int val = map.get(s.charAt(i));
                val++;
                map.put(s.charAt(i),val);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        //set is here to store unique values and we only want unique values :)
        Set<Integer> set = new HashSet<>();
        int deletecount = 0;
        for(char c: map.keySet()){
            int freq = map.get(c);
            if(!set.contains(freq)){
                set.add(freq);
            }
            else{
                while(freq > 0 && set.contains(freq)){
                    freq--;
                    deletecount++;
                }
                set.add(freq);
            }
        }
        return deletecount;
    }
}
