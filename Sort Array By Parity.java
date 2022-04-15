class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int even = 0;
      int odd = 0;
      for(int i = 0;i < nums.length;i++){
          if(nums[i]%2 == 0){
              even++;
          }
          else{
              odd++;
          }
      }
        int[] evenarray = new int[even];
        int[] oddarray = new int[odd];
        int a = 0;
        int b = 0;
        for(int i = 0;i < nums.length;i++){
          if(nums[i]%2 == 0){
              evenarray[a++] = nums[i];
          }
          else{
              oddarray[b++] = nums[i];
          }
      }
     int m = 0;
     int n = 0;
     for(int i = 0;i < nums.length;i++){
          if(even != 0){
              nums[i] = evenarray[m++];
              even--;
          }
          else{
              nums[i] = oddarray[n++];
              odd--;
          }
      }
        return nums;
        
    }
}
