import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    Queue<Integer> queue = new LinkedList<>();

    public void push(int data) {
        queue.add(data);
        int size = queue.size();
        while (size-- > 1) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.isEmpty() ? -1 : queue.poll();
    }

    public int top() {
        return queue.isEmpty() ? -1 : queue.peek();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // Output: 20
        System.out.println(stack.top()); // Output: 10
    }
}
