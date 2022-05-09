class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> evenlist = new ArrayList<>();
        List<Integer> oddlist = new ArrayList<>();
        
        for(int i = 0;i < nums.length;i++){
            if(i%2 != 0){
                oddlist.add(nums[i]);
            }
            else{
                evenlist.add(nums[i]);
            }
        }
        
        Collections.sort(evenlist);
        Collections.sort(oddlist,Collections.reverseOrder());
        
        int[] result = new int[nums.length];
        int j = 0; //even index
        int k = 0; //odd index
        for(int i = 0;i < result.length;i++){
            if(i%2 == 0){
                result[i] = evenlist.get(j);
                j++;
            }
            else{
                result[i] = oddlist.get(k);
                k++;
            }
        }
       return result; 
    }
}
