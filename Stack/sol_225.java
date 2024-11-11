class MyStack {

    
       Stack <Integer> a=new Stack<>();
    
    
    public void push(int x) {
        a.push(x);
    }
    
    public int pop() {
        return a.pop();
    }
    
    public int top() {
      return a.peek();  
    }
    
    public boolean empty() {
        if(a.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}

