// Last updated: 04/10/2025, 01:43:53


class MyQueue {
    private Stack<Integer> stack;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        while (!stack2.isEmpty()) {
            stack.push(stack2.pop());
        }
        stack.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack.isEmpty() && stack2.isEmpty();
    }
}
