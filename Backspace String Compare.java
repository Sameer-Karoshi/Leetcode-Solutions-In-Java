class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch != '#'){
                stack1.push(ch);
            }
            else if(!stack1.isEmpty()){
                stack1.pop();
            }
        }
        
        for(int i = 0;i < t.length();i++){
            char ch = t.charAt(i);
            if(ch != '#'){
                stack2.push(ch);
            }
            else if(!stack2.isEmpty()){
                stack2.pop();
            }
        }
        
        String res1 = "";
        while(!stack1.isEmpty()){
            res1 = res1 + stack1.pop();
        }
        
        String res2 = "";
        while(!stack2.isEmpty()){
            res2 = res2 + stack2.pop();
        }
        return res1.equals(res2);
    }
}
