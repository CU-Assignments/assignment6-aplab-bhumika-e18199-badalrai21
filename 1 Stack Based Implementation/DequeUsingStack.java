import java.util.Stack;

class DequeUsingStack {
    Stack<Integer> frontStack = new Stack<>();
    Stack<Integer> rearStack = new Stack<>();

    public void addFront(int data) {
        frontStack.push(data);
    }

    public void addRear(int data) {
        rearStack.push(data);
    }

    public int removeFront() {
        if (frontStack.isEmpty()) {
            while (!rearStack.isEmpty()) {
                frontStack.push(rearStack.pop());
            }
        }
        return frontStack.isEmpty() ? -1 : frontStack.pop();
    }

    public int removeRear() {
        if (rearStack.isEmpty()) {
            while (!frontStack.isEmpty()) {
                rearStack.push(frontStack.pop());
            }
        }
        return rearStack.isEmpty() ? -1 : rearStack.pop();
    }

    public static void main(String[] args) {
        DequeUsingStack deque = new DequeUsingStack();
        deque.addFront(10);
        deque.addRear(20);
        deque.addFront(5);
        System.out.println(deque.removeFront()); // Output: 5
        System.out.println(deque.removeRear());  // Output: 20
    }
}
