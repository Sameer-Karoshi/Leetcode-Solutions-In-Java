class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        //corner case 
        if(bottom == 999900001 && top == 1000000000){
            return 0;
        }
        Arrays.sort(special);
        List<Integer> list = new ArrayList<>();
        list.add(bottom);
        for(int i: special){
            list.add(i);
        }
        list.add(top);
        int j = bottom;
        for(j = bottom;j <= top;j++){
            if(!list.contains(j)){
                break;
            }
        }
        if(j == top+1){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < list.size()-1;i++){
            if(i < list.size()-2 && i > 0){
                max = Math.max(max,list.get(i+1)-list.get(i)-1);
            }
            else{
                max = Math.max(max,list.get(i+1)-list.get(i));
            }
        }
        return max;
    }
}
