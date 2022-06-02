class Solution {
    public String reformatDate(String date) {
        String[] arr = date.split(" ");
        String res = "";
        res = res + arr[2] + "-" + GetMonthNumber(arr[1]) + "-";
        if(arr[0].length() == 3){
            res = res + "0" + arr[0].substring(0,1);
        }
        else{
            res = res + arr[0].substring(0,2);
        }
        return res; 
    }
    public String GetMonthNumber(String mon){
        if(mon.equals("Jan")){
            return "01";
        }
        else if(mon.equals("Feb")){
            return "02";
        }
        else if(mon.equals("Mar")){
            return "03";
        }
        else if(mon.equals("Apr")){
            return "04";
        }
        else if(mon.equals("May")){
            return "05";
        }
        else if(mon.equals("Jun")){
            return "06";
        }
        else if(mon.equals("Jul")){
            return "07";
        }
        else if(mon.equals("Aug")){
            return "08";
        }
        else if(mon.equals("Sep")){
            return "09";
        }
        else if(mon.equals("Oct")){
            return "10";
        }
        else if(mon.equals("Nov")){
            return "11";
        }
        return "12";
        
    }
}
