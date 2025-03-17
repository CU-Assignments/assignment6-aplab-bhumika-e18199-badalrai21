import java.util.LinkedList;
import java.util.Queue;

class DequeUsingQueue {
    Queue<Integer> queue = new LinkedList<>();

    public void addFront(int data) {
        Queue<Integer> temp = new LinkedList<>();
        temp.add(data);
        while (!queue.isEmpty()) {
            temp.add(queue.poll());
        }
        queue = temp;
    }

    public void addRear(int data) {
        queue.add(data);
    }

    public int removeFront() {
        return queue.isEmpty() ? -1 : queue.poll();
    }

    public int removeRear() {
        if (queue.isEmpty()) return -1;
        Queue<Integer> temp = new LinkedList<>();
        int last = -1;
        while (!queue.isEmpty()) {
            last = queue.poll();
            if (!queue.isEmpty()) {
                temp.add(last);
            }
        }
        queue = temp;
        return last;
    }

    public static void main(String[] args) {
        DequeUsingQueue deque = new DequeUsingQueue();
        deque.addFront(10);
        deque.addRear(20);
        deque.addFront(5);
        System.out.println(deque.removeFront()); // Output: 5
        System.out.println(deque.removeRear());  // Output: 20
    }
}
