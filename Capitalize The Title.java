class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        String result = "";
        for(int i = 0;i < arr.length;i++){
            if(arr[i].length() <= 2){
                result = result + arr[i].toLowerCase() + " ";
            }
            else{
                arr[i] = arr[i].toLowerCase();
                arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
                result = result + arr[i] + " ";
            }
        }
        return result.trim();
    }
}
