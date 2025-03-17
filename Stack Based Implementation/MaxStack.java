import java.util.Stack;

class MaxStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();

    public void push(int data) {
        mainStack.push(data);
        if (maxStack.isEmpty() || data >= maxStack.peek()) {
            maxStack.push(data);
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) return -1;
        int removed = mainStack.pop();
        if (removed == maxStack.peek()) {
            maxStack.pop();
        }
        return removed;
    }

    public int getMax() {
        return maxStack.isEmpty() ? -1 : maxStack.peek();
    }

    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();
        maxStack.push(5);
        maxStack.push(10);
        maxStack.push(3);
        System.out.println(maxStack.getMax()); // Output: 10
        maxStack.pop();
        System.out.println(maxStack.getMax()); // Output: 10
    }
}
