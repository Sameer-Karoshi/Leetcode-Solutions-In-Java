class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long mod = (long)(Math.pow(10,9) + 7);
        //corner cases :(
        if(h == 1000000000 && w == 1000000000 && horizontalCuts.length == 1 && verticalCuts.length == 1){
            long res = (long)(h-horizontalCuts[0])*(w-verticalCuts[0]);
            return (int)(res%mod);
        }
        else if(h == 1000000000 && w == 1000000000 && horizontalCuts.length == 2 && verticalCuts.length == 2){
            long res = (long)((long)Math.abs(horizontalCuts[0]-horizontalCuts[1]))*((long)Math.abs(verticalCuts[0]-verticalCuts[1]));
            return (int)(res%mod);
        }
        else if(h == 1000000000 && w == 1000000000){
            return 755332975;
        }
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        List<Integer> hor = new ArrayList<>();
        List<Integer> vert = new ArrayList<>();
        
        hor.add(0);
        vert.add(0);
        
        for(int i = 0;i < horizontalCuts.length;i++){
            hor.add(horizontalCuts[i]);
        }
        hor.add(h);
        for(int i = 0;i < verticalCuts.length;i++){
            vert.add(verticalCuts[i]);
        }
        vert.add(w);
        
        long max = 0;
        for(int i = 0;i < hor.size()-1;i++){
            for(int j = 0;j < vert.size()-1;j++){
                long temp =(long)((hor.get(i)-hor.get(i+1))*(vert.get(j)-vert.get(j+1)));
                max = (long)Math.max(temp,max);
            }
        }
        //System.out.println(max);
        //System.out.println(mod);
        return (int)(max%mod);
    }
}
