class Solution {
    public int maxDepth(String s) {
        Stack<Character> stk = new Stack<>();
        int max = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '('){
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                max = Math.max(max,stk.size());
                if(stk.size() != 0){
                    stk.pop();
                }
            }
        }
        return max;
    }
}
