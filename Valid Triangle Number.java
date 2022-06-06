class Solution {
    public int triangleNumber(int[] a) {
        Arrays.sort(a);
        int c=0,k=a.length;
        for(int i=k-1;i>=2;i--)
        {
            for(int j=i-1;j>=1;j--)
            {
                for(int p=j-1;p>=0;p--)
                {
                    if(a[j]+a[p]>a[i])
                    {
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
