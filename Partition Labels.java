class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<Integer>();
        int lastindex = 0;
        for(int i = 0;i < s.length();i++){
            char ch1 = s.charAt(i);
            int tempindex = s.lastIndexOf(ch1);
            for(int j = i + 1;j < tempindex;j++){
                char ch2 = s.charAt(j);
                int index = s.lastIndexOf(ch2); 
                if(index > tempindex){
                    tempindex = index;
                }
            }
            list.add(tempindex+1);
            i = tempindex;
        }
    List<Integer> result = new ArrayList<Integer>();
    for(int i = 0;i < list.size();i++){
        if(i == 0){
           result.add(list.get(i)); 
        }
        else{
            result.add(list.get(i) - list.get(i-1));
        }
        
    }
    return result;
    }
}