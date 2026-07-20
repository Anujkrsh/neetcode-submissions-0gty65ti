class MinStack {
    Deque<Integer> mainStack;
    Deque<Integer> minStack;
    public MinStack() {
         mainStack = new ArrayDeque<>();
         minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
     if(minStack.isEmpty()){
        minStack.push(val);
     }else if(minStack.peek()>=val){
        minStack.push(val);
     }
     mainStack.push(val);
    }
    
    public void pop() {

        if(mainStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        mainStack.pop();
        
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
       return minStack.peek();
    }
}
