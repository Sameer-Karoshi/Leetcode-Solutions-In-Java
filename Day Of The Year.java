class Solution {
    public int dayOfYear(String date) {
        String[] arr = date.split("-");
        int res = 0;
        for(int i = 1;i < Integer.parseInt(arr[1]);i++){
            res = res + TotalDays(arr[0],i);
        }
        return res + Integer.parseInt(arr[2]);
    }
    public int TotalDays(String year, int month){
        boolean isLeap = checkYear(Integer.parseInt(year));
        if(month == 1){
            return 31;
        }
        else if(month == 2 && isLeap){
            return 29;
        }
        else if(month == 2 && !isLeap){
            return 28;
        }
        else if(month == 3){
            return 31;
        }
        else if(month == 4){
            return 30;
        }
        else if(month == 5){
            return 31;
        }
        else if(month == 6){
            return 30;
        }
        else if(month == 7){
            return 31;
        }
        else if(month == 8){
            return 31;
        }
        else if(month == 9){
            return 30;
        }
        else if(month == 10){
            return 31;
        }
        else if(month == 11){
            return 30;
        }
        return 31;
    }
    public boolean checkYear(int year)
    {
        // If a year is multiple of 400,
        // then it is a leap year
        if (year % 400 == 0)
            return true;
     
        // Else If a year is multiple of 100,
        // then it is not a leap year
        if (year % 100 == 0)
            return false;
     
        // Else If a year is multiple of 4,
        // then it is a leap year
        if (year % 4 == 0)
            return true;
        return false;
    }
}
