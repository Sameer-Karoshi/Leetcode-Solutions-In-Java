class Solution {
    public int maxArea(int[] height) {
        
        int i=0;
        int j=height.length-1;
        int area=0,temp;
            while(i<j)
            {
                    if(height[i]>height[j])
                    {
                           temp= height[j]*(j-i);
                           j--;
                           area = Math.max(area,temp);
                    }

                    else
                    {        
                         temp=height[i]*(j-i);
                         i++;
                         area= Math.max(area,temp);

                    }


            }

        return area;

    }
}