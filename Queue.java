public class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }
    public void insert(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full. Cannot insert element.");
        } else {
            queueArray[++rear] = value;
            System.out.println("Inserted element: " + value);
        }
    }
    public int remove() {
        if (front > rear) {
            System.out.println("Queue is empty. Cannot remove element.");
            return -1;
        } else {
            int value = queueArray[front++];
            System.out.println("Removed element: " + value);
            return value;
        }
    }
    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            System.out.println("Front element: " + queueArray[front]);
            return queueArray[front];
        }
    }
    public boolean isEmpty() {
        return (front > rear);
    }
    public boolean isFull() {
        return (rear == maxSize - 1);
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        queue.peek();
        queue.remove();
        queue.peek();

        queue.isEmpty();
        queue.isFull();
    }
}