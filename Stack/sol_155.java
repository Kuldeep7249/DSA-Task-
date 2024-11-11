class MinStack {

    Stack<Integer> a = new Stack<>();
    Stack<Integer> b = new Stack<>();

    public void push(int val) {
        a.push(val);
        if (b.isEmpty() || val <= b.peek()) {
            b.push(val);
        }
    }

    public void pop() {
        if (!a.isEmpty()) {
            int j = a.pop();
            if (!b.isEmpty() && j == b.peek()) {
                b.pop();
            }
        }
    }

    public int top() {
        if (!a.isEmpty()) {
            return a.peek();
        }
        throw new NoSuchElementException("Stack is empty");
    }

    public int getMin() {
        if (!b.isEmpty()) {
            return b.peek();
        }
        throw new NoSuchElementException("Stack is empty");
    }
}
