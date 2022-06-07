class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int minindex = -1;
        int maxindex = -1;
        
        int minvalue = Integer.MAX_VALUE;
        int maxvalue = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > maxvalue){
                maxvalue = nums[i];
                maxindex = i;
            }    
            if(nums[i] < minvalue){
                minvalue = nums[i];
                minindex = i;
            }
        }
        
        int res=0;
	    int n=nums.length-1;
	    int sc1, sc2, sc3; //three scenarios
	        
	    sc1= (maxindex>minindex)?maxindex+1:minindex+1; //both lie on the initial side of the array
	    sc2=((n-maxindex)>(n-minindex))?(n-maxindex)+1:(n-minindex)+1; //both lie towards the end of array
	    sc3= Math.min(maxindex+(n-minindex)+2, minindex+(n-maxindex)+2); //one near start and other near end

	    res=(sc1<sc2)?Math.min(sc1,sc3):Math.min(sc2,sc3); 
        return res;
        
    }
}
