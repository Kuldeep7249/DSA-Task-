class MyQueue {

    Queue<Integer> a=new LinkedList<>();
    
    public void push(int x) {
        a.offer(x);
    }
    
    public int pop() {
        return a.remove();
    }
    
    public int peek() {
        return a.peek();
    }
    
    public boolean empty() {
        return a.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */