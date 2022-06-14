class Solution {
    public int maximum69Number (int num) {
        String temp = Integer.toString(num);
        int index = -1;
        for(int i = 0;i < temp.length();i++){
            if(temp.charAt(i) == '6'){
                index = i;
                break;
            }
        }
        
        if(index != -1){
            String res = temp.substring(0,index) + '9' + temp.substring(index+1);
            return (int)Integer.parseInt(res);
        }
        return num;
    }
}
    
