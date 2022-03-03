class Solution {
    public int addDigits(int num) {
        
        int sum = 0;
        while(num != 0){
            int reminder = num % 10;
            sum = sum + reminder;
            reminder = num % 10;
            num = num / 10;
        }
       
        if(sum <= 9){
            return sum;
        }
        else{
            return addDigits(sum);
        }
    }
}