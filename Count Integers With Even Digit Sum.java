class Solution {
    public int countEven(int num) {
        int result = 0;
        for(int i = 1;i < num+1;i++){
            String temp = Integer.toString(i);
            int sum = 0;
            for(int j = 0;j < temp.length();j++){
                char ch = temp.charAt(j);
                //System.out.println(ch);
                int n = Integer.parseInt(Character.toString(ch));
                sum = sum + n;
            }
            if(sum%2 == 0){
              //System.out.println(i);
              //System.out.println(sum);
              result++;  
            }
        }
        return result;
    }
}
