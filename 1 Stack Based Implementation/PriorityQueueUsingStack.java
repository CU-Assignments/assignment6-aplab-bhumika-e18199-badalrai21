import java.util.Stack;

class PriorityQueueUsingStack {
    Stack<Integer> stack = new Stack<>();

    public void push(int data) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty() && stack.peek() > data) {
            tempStack.push(stack.pop());
        }
        stack.push(data);
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public int pop() {
        return stack.isEmpty() ? -1 : stack.pop();
    }

    public int peek() {
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public static void main(String[] args) {
        PriorityQueueUsingStack pq = new PriorityQueueUsingStack();
        pq.push(5);
        pq.push(1);
        pq.push(3);
        System.out.println(pq.pop()); // Output: 1
        System.out.println(pq.pop()); // Output: 3
    }
}
