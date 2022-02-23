class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
           char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
                continue;
            }
            else
            {
                if(st.size() == 0)
                    return false;
                switch(ch){
                    case ')' :
                        if(st.peek() == '(')
                            st.pop();
                        else
                            return false;
                        break;
                        
                    case ']' :
                        if(st.peek() == '[')
                            st.pop();
                        else
                            return false;
                        break;
                        
                     case '}' :
                        if(st.peek() == '{')
                            st.pop();
                        else
                            return false;
                        break;
                        
                }
            }
        }
        if(st.size() == 0)
            return true;
        else
            return false;
    }
}
