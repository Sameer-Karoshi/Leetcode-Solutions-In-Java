class Solution {
    public boolean areNumbersAscending(String s) {
        List list = new ArrayList<Integer>();
        String[] array = s.split(" ");
        for(int i = 0;i < array.length;i++){
            try {
                Integer num = Integer.parseInt(array[i]);
                list.add(num);
            } 
            catch (NumberFormatException e) {
                continue;
            }     
        }
        
        boolean result = false;
        int max = (int)list.get(0);
        int i;
        for(i = 1;i < list.size();i++){
            int temp = (int)list.get(i);
            if(temp > max){
                max = temp;
            }
            else{
                break;
            }
        }
        
        if(i == list.size()){
            result = true;
        }
        return result;
    }
}