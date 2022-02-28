class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> output = new ArrayList<>();
        
        List<String> SortedStringList = new ArrayList<String>();
        
        for(int i = 0;i < strs.length;i++){
            //Sort the each string and put it in new list :)
            char temp[] = strs[i].toCharArray();
            Arrays.sort(temp);
            SortedStringList.add(new String(temp));
        }
        
        //System.out.println(SortedStringList);
        
        for(int i = 0;i < strs.length;i++){
            List<String> temp = new ArrayList<String>();
            temp.add(strs[i]);
            for(int j = i+1;j < strs.length;j++){
                if(SortedStringList.get(i).equals(SortedStringList.get(j)) && (SortedStringList.get(i) != "##")){
                   temp.add(strs[j]);
                   strs[j] = "##";
                   //SortedStringList.remove(SortedStringList.get(i));
                }
            }
            output.add(temp);
        }
      //Final Result
        
        List<List<String>> result = new ArrayList<>();
        for(int i = 0;i < output.size();i++){
            for(int j = 0;j < output.get(i).size();j++){
                
                if(output.get(i).get(j) != "##"){
                    List<String> tempstr = output.get(i);
                    result.add(tempstr);
                    break;
                }
            }
        }
        return result;
    }
}