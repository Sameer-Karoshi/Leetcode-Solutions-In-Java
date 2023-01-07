class Solution {
    public int countDigits(int num) {
        int resultCount = 0;
        String numString = Integer.toString(num);
        for(int i = 0;i < numString.length();i++){
            if (num % (Integer.parseInt(Character.toString(numString.charAt(i)))) == 0){
                resultCount++;
            }
        }
        return resultCount;
    }
}
