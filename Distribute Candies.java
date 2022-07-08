class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int i: candyType){
            set.add(i);
        }
        int uniquecandies = set.size();
        int n = candyType.length;
        if(n/2 <= uniquecandies){
            return n/2;
        }
        return uniquecandies;
    }
}
