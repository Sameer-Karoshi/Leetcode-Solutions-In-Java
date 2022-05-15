class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double average = 0f;
        for(int i = 1;i < salary.length-1;i++){
            average = average + salary[i];
        }
        //System.out.println(average);
        return average/(salary.length-2);
    }
}
