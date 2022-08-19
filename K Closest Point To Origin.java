class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //creating one double array :)
        double[][] res = new double[points.length][3];
        for(int i = 0;i < points.length;i++){
            double dist = Math.sqrt(Math.pow(points[i][0],2)+Math.pow(points[i][1],2));
            //0th index: x
            //1st index: y
            //2nd index: distance
            res[i][0] = points[i][0];
            res[i][1] = points[i][1];
            res[i][2] = dist;
        }
        //sorting this array according to distance in ascending order
        Arrays.sort(res, new java.util.Comparator<double[]>() {
            public int compare(double[] a, double[] b) {
                return Double.compare(a[2], b[2]);
            }
            });
        int[][] ans = new int[k][2];
        for(int i = 0;i < k;i++){
            ans[i][0] = (int)res[i][0];
            ans[i][1] = (int)res[i][1];
        }
        return ans;
    }
}
