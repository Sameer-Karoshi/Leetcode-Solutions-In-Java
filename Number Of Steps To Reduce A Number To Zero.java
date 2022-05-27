class Solution {
    public int numberOfSteps(int num) {
        //steps means total steps to reduce number to zero
        int steps = 0;
        while(num != 0){
            if(num%2 == 0){
                num = num/2;
                steps++;
            }
            else{
                num = num - 1;
                steps++;
            }
        }
        return steps;
    }
}
