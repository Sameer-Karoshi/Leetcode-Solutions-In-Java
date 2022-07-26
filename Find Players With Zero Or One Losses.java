class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> winner = new HashMap<>();
        HashMap<Integer,Integer> loser = new HashMap<>();
        
        for(int i = 0;i < matches.length;i++){
            if(winner.containsKey(matches[i][0])){
                int val = winner.get(matches[i][0]);
                val++;
                winner.put(matches[i][0],val);
            }
            else{
                winner.put(matches[i][0],1);
            }
        }
        
        for(int i = 0;i < matches.length;i++){
            if(loser.containsKey(matches[i][1])){
                int val = loser.get(matches[i][1]);
                val++;
                loser.put(matches[i][1],val);
            }
            else{
                loser.put(matches[i][1],1);
            }
        }
        
        List<Integer> winlist = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : winner.entrySet()){
            int key = (int)entry.getKey();
            if(!loser.containsKey(key)){
                winlist.add(key);
            }
        }
        //System.out.println(loser);
        
        List<Integer> loslist = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : loser.entrySet()){
            int value = (int)entry.getValue();
            if(value == 1){
                loslist.add((int)entry.getKey());
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        Collections.sort(winlist);
        Collections.sort(loslist);
        res.add(winlist);
        res.add(loslist);
        return res;
    }
}
