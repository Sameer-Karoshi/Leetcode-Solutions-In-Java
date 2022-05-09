class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> evenlist = new ArrayList<>();
        List<Integer> oddlist = new ArrayList<>();
        
        for(int i = 0;i < nums.length;i++){
            if(nums[i]%2 == 0){
                evenlist.add(nums[i]);
            }
            else{
                oddlist.add(nums[i]);
            }
        }
        
        Collections.sort(evenlist);
        Collections.sort(oddlist);
        
        int[] result = new int[nums.length];
        int even = 0;
        int odd = 0;
        for(int i = 0;i < result.length;i++){
            if(i%2 == 0){
                result[i] = evenlist.get(even);
                even++;
            }
            else{
               result[i] = oddlist.get(odd);
               odd++; 
            }
        }
        return result;
    }
}
