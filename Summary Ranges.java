class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list = new ArrayList<String>();
        for(int i = 0;i < nums.length;i++){
            int temp = nums[i];
            
            int j;
            for(j = i+1;j < nums.length;j++){
                temp++;
                if(nums[j] == temp){
                    continue;
                }
                else{
                    break;
                }
            }
            if(nums[i] == temp){
                list.add(Integer.toString(nums[i]));
            }
            else{
                if(nums[i] == nums[j-1]){
                    list.add(Integer.toString(nums[i]));
                    i = j-1;
                }
                else{
                list.add(Integer.toString(nums[i]) + "->" + Integer.toString(nums[j-1]));
                    i = j - 1;             
                    }
            }
        }
       return list; 
    }
}