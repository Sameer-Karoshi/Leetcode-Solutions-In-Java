/*class Solution {
    public int minDeletion(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int n = nums.length;
        System.out.println(n);
        int count = 0;
        for(int i = 0;i < n-1;i++){
            if(nums[i] == nums[i+1] && i%2 == 0){
                for(int j = i;j < n-1;j++){
                    nums[j] = nums[j+1];
                }
                n--;
                i--;
                count++;
            }
        }
        System.out.println(count);
        if(n%2 == 0){
            return count;
        }
        return count + 1;
    }
}
*/
class Solution {
    public int minDeletion(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int n = nums.length;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(!stk.isEmpty()){
                if(stk.size()%2==0){
                    stk.add(nums[i]);
                }else{
                    if(stk.peek()==nums[i]) count++;
                    else stk.add(nums[i]);
                }
            }else{
                stk.add(nums[i]);
            }
        }
        if(stk.size()%2==1) count++;
        return count;
    }
}
