class Solution {
    public String frequencySort(String s) {
      //First create one set 
      HashSet<Character> set=new HashSet(); 
      for(int i = 0;i < s.length();i++){
          char ch = s.charAt(i);
          set.add(ch);
      }
      
     TreeMap<Character,Integer> tree_map = new TreeMap<Character,Integer>();
     Iterator<Character> j=set.iterator();
      while(j.hasNext()){
          char ch1 = j.next();
          int frequency = 0;
          for(int i = 0;i < s.length();i++){
             char ch2 = s.charAt(i);
              if(ch1 == ch2){
                  frequency++;
              }
          }
          
          tree_map.put(ch1,frequency);
      }
        
    Map sortedMap = valueSort(tree_map);
    Set set1 = sortedMap.entrySet();
    Iterator i = set1.iterator();
    String result = "";
        while (i.hasNext()) {
            
            Map.Entry mp = (Map.Entry)i.next();
            char ch = (char)mp.getKey();
            int frequency =(int) mp.getValue();
            while(frequency > 0){
                result = result + ch;
                frequency--;
            }
            
        }
      StringBuilder SB = new StringBuilder(result);
      result = SB.reverse().toString();
      return result;
    }
    
    public <K, V extends Comparable<V> > Map<K, V>
    valueSort(final Map<K, V> map)
    {
        // Static Method with return type Map and
        // extending comparator class which compares values
        // associated with two keys
        Comparator<K> valueComparator = new Comparator<K>() {
            
                  // return comparison results of values of
                  // two keys
                  public int compare(K k1, K k2)
                  {
                      int comp = map.get(k1).compareTo(
                          map.get(k2));
                      if (comp == 0)
                          return 1;
                      else
                          return comp;
                  }
            
              };
        
        // SortedMap created using the comparator
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
        
        sorted.putAll(map);
        return sorted;
    }
}