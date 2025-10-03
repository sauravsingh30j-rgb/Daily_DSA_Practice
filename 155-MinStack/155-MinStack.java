// Last updated: 04/10/2025, 01:44:23
class MinStack {
    Stack<Integer> stack=new Stack<>();
     Stack<Integer> min=new Stack<>();

   public void push(int x) {
        stack.push(x);
        if (min.isEmpty() || x <= min.peek()) min.push(x);
    }

    public void pop() {
        if (stack.pop().equals(min.peek())) min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();}}
