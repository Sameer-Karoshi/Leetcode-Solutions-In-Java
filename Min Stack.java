class MinStack {
    Stack<Integer> stack;
    public MinStack() {
       stack = new Stack<Integer>();
    }
    
    public void push(int val) {
       stack.push(val); 
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    
    public int top() {
        int result = 0;
        if(!stack.isEmpty()){
           result = stack.peek(); 
        }
        return result;
    }
    
    public int getMin() {
        List<Integer> list = new ArrayList<Integer>();
        Iterator value = stack.iterator();
        while(value.hasNext()){
           list.add((int)value.next()); 
        }
        Collections.sort(list);
        return list.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
