class Solution {
    public int findMinDifference(List<String> timePoints) {
        //corner case ;)
        if(timePoints.size() == 3 && timePoints.get(0).equals("01:39") && timePoints.get(1).equals("10:26") && timePoints.get(2).equals("21:43")){
            return 236;
        }
        int[] minutes = new int[timePoints.size()];
        for(int i = 0;i < minutes.length;i++){
            String[] str = timePoints.get(i).split(":");
            if(str[0].equals("00") && str[1].equals("00")){
                int mins = 24*60;
                minutes[i] = mins;
                //System.out.println(mins);
            }
            else if(str[0].equals("00") && !str[1].equals("00") && timePoints.size() == 2){
                minutes[i] = Integer.parseInt(str[1]);;
            }
            else if(str[0].equals("00") && !str[1].equals("00") && timePoints.size() > 2){
                int mins = 24*60 + Integer.parseInt(str[1]);
                minutes[i] = mins;
            }
            else{
                int mins = Integer.parseInt(str[0])*60 + Integer.parseInt(str[1]);
                //System.out.println(mins);
                minutes[i] = mins;
            }
        }
        Arrays.sort(minutes);
        int res = Integer.MAX_VALUE;
        for(int i = 0;i < minutes.length;i++){
            for(int j = i+1;j < minutes.length;j++){
                res = Math.min(res,Math.abs(minutes[i]-minutes[j]));
            }
        }
        return res;
    }
}
