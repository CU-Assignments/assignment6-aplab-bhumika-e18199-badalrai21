import java.util.LinkedList;
import java.util.Queue;

class CircularQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = rear = size = 0;
    }

    public void enqueue(int data) {
        if (size == capacity) return;
        arr[rear] = data;
        rear = (rear + 1) % capacity;
        size++;
    }

    public int dequeue() {
        if (size == 0) return -1;
        int removed = arr[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    public int front() {
        return size == 0 ? -1 : arr[front];
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue()); // Output: 10
        System.out.println(queue.front());   // Output: 20
    }
}
