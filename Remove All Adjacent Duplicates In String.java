class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(!stk.isEmpty() && stk.peek() == ch){
                stk.pop();
            }
            else{
                stk.push(ch);
            }
        }
        String res = "";
        while(!stk.isEmpty()){
            res = res + stk.pop();
        }
        StringBuilder sb = new StringBuilder(res);
        res = sb.reverse().toString();
        return res;
    }
}
