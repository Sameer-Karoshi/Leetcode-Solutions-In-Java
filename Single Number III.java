class Solution {
    public int[] singleNumber(int[] nums) {
      Arrays.sort(nums);
      
      List list = new ArrayList<Integer>();
      for(int i = 0;i < nums.length;i++){
          int freq = 0;
          for(int j = i;j < nums.length;j++){
              if(nums[i] == nums[j]){
                  freq++;
              }
              else{
                  break;
              }
          }
          if(freq == 2){
              i++;
          }
          else if(freq == 1){
              list.add(nums[i]);
          }
      }
        
    int[] result = new int[list.size()];
    for(int i = 0;i < list.size();i++){
        result[i] = (int)list.get(i);
    }
        
        return result;
    }
}