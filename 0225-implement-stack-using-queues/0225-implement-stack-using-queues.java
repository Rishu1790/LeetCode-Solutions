import java.util.Stack;

class MyStack {

    private Stack<Integer> stack;

    public MyStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    // Insert element at the bottom of the stack
    public void pushAtBottom(int x) {
        pushAtBottomHelper(x);
    }

    private void pushAtBottomHelper(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }

        int top = stack.pop();
        pushAtBottomHelper(x);
        stack.push(top);
    }

    public int pop() {
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}