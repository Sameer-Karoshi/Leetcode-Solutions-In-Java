class CustomStack {
    List<Integer> stack = new ArrayList<>();
    int size;
    public CustomStack(int maxSize) {
        size = maxSize;
    }
    
    public void push(int x) {
        if (stack.size() < size) {
            stack.add(x);
        }
    }
    
    public int pop() {
        if (stack.isEmpty()){
            return -1;
        }
        return stack.remove(stack.size()-1);
    }
    
    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k,stack.size()); i++) {
            stack.set(i, stack.get(i) + val);            
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
