class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stk = new Stack<Integer>();
        for(int i = 0;i < ops.length;i++){
            boolean numeric = true;

        int num = 0;
        try {
          num = Integer.parseInt(ops[i]);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        
        if(numeric){
            //System.out.println(num);
            stk.push(num);
        }
        else if(!stk.isEmpty() && ops[i].equals("C")){
            stk.pop();
        }
        else if(!stk.isEmpty() &&  ops[i].equals("D")){
            stk.add(stk.peek()*2);
        }
        else if(!stk.isEmpty() &&  ops[i].equals("+")){
            int top = stk.peek(); 
            stk.pop();
            int second = stk.peek();
            stk.push(top);
            stk.add(top+second);
        }
        }
        //System.out.println(stk);
        int sum = 0;
        while(!stk.isEmpty()){
            //System.out.println(stk.peek());
            sum = sum + stk.peek();
            stk.pop();
        }
        return sum;
    }
}
