class Solution {
    public int dominantIndex(int[] nums) {
      int firstmax = 0;
      int index = -1;
      for(int i = 0;i < nums.length;i++){
          if(nums[i] > firstmax){
              firstmax = nums[i];
              index = i;
          }
      }
     System.out.println(firstmax);
     System.out.println(index);
     for(int i = 0;i < nums.length;i++){
         if(i != index && firstmax < nums[i]*2){
             return -1;
         }
     }
        return index;
    }
}
