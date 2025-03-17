import java.util.Stack;

class MinStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int data) {
        mainStack.push(data);
        if (minStack.isEmpty() || data <= minStack.peek()) {
            minStack.push(data);
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) return -1;
        int removed = mainStack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
        return removed;
    }

    public int getMin() {
        return minStack.isEmpty() ? -1 : minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(2);
        minStack.push(8);
        System.out.println(minStack.getMin()); // Output: 2
        minStack.pop();
        System.out.println(minStack.getMin()); // Output: 2
    }
}
