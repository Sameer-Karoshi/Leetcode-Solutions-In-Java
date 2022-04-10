class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> list = new ArrayList<String>();
        for(int i = 1;i < n + 1;i++){
            list.add(Integer.toString(i));
        }
        Collections.sort(list);
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i < n;i++){
            result.add(Integer.parseInt(list.get(i)));
        }
        return result;
        
    }
}
