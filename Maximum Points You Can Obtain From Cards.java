class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sublen = cardPoints.length - k;
        int totalsum = 0;
        for(int i: cardPoints){
            totalsum = totalsum + i;
        }
        if(k == cardPoints.length){
            return totalsum;
        }
        int minsubsum = Integer.MAX_VALUE;
        for(int i = 0;i <= k;i++){
            int temp = 0;
            for(int j = i;j < i + sublen;j++){
                temp = temp + cardPoints[j];
            }
            System.out.println(temp);
            if(temp < minsubsum){
                minsubsum = temp;
            }
        }
        return totalsum - minsubsum;
    }
}
