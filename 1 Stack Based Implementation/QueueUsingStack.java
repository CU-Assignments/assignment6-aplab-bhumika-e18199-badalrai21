import java.util.Stack;

class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
    }
}
