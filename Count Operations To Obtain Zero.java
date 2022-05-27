class Solution {
    int result = 0;
    public int countOperations(int num1, int num2) {
        if(num1 == 0 || num2 == 0){
            return result;
        }
        else if(num1 >= num2){
            result++;
            countOperations(num1-num2,num2);
        }
        else{
            result++;
            countOperations(num1,num2-num1);
        }
        return result;
    }
}
