class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] str= text.split(" ");
        List<String> result = new ArrayList<>();
        for(int i = 0;i < str.length - 2;i++){
            if(str[i].equals(first) && str[i+1].equals(second)){
                result.add(str[i+2]); 
            }
        }
        
      String[] myArray = new String[result.size()];
      result.toArray(myArray);
      return myArray;
    }
}
