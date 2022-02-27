class Solution {
    public int singleNumber(int[] nums) {
        //First sort the array :)
        Arrays.sort(nums);
        
        //Then remove duplicates from an array using hashset
        Set<Integer> hash_set = new HashSet<Integer>();
        for(int i = 0;i < nums.length;i++){
            hash_set.add(nums[i]);
        }
        
        int[] array = new int[hash_set.size()];
        int k = 0;
        for(Integer i: hash_set){
            array[k] = i;
            k++;
        }
        
        int[] frequency_array = new int[hash_set.size()];
        for(int i = 0;i < frequency_array.length;i++){
            frequency_array[i] = 0;
        }
        for(int i = 0;i < array.length;i++){
            int element = array[i];
            for(int j = 0;j < nums.length;j++){
                if(nums[j] == element){
                    frequency_array[i]++;
                }
            }
        }
 
        int result = 0;
        for(int i = 0;i < array.length;i++){
            if(frequency_array[i] == 1){
                result = array[i];
                break;
            }
        }
    
        return result;
    }
}