class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left;i <= right;i++){
            String temp = Integer.toString(i);
            int j = 0;
            for(j = 0;j < temp.length();j++){
                char ch = temp.charAt(j);
                int n = Character.getNumericValue(ch);
                //System.out.println(n);
                if(n == 0 || i%n != 0){
                    break;
                }
            }
            if(j == temp.length()){
                list.add(i);
            }
        }
        return list;
    }
}