class Solution {
   public int minimumSum(int num) {
        int[] arr = new int[4];

        for(int i = 0; i < 4; i++) {
            arr[i] = num % 10;
            num = num/10;
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        return arr[0] * 10 + arr[2] + arr[1]*10 + arr[3];
 }
}
