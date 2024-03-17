public class Queue {
    private int[] A;
    private int front, rear;
    private final int MAX_SIZE = 101; // maximum size of the array that will store Queue.

    public Queue() {
        front = -1;
        rear = -1;
        A = new int[MAX_SIZE];
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return (rear + 1) % MAX_SIZE == front ? true : false;
    }

    public void enqueue(int x) {
        System.out.println("Enqueuing " + x);
        if (isFull()) {
            System.out.println("Error: Queue is Full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % MAX_SIZE;
        }
        A[rear] = x;
    }

    public void dequeue() {
        System.out.println("Dequeuing");
        if (isEmpty()) {
            System.out.println("Error: Queue is Empty");
            return;
        } else if (front == rear) {
            rear = front = -1;
        } else {
            front = (front + 1) % MAX_SIZE;
        }
    }

    public int front() {
        if (front == -1) {
            System.out.println("Error: cannot return front from empty queue");
            return -1;
        }
        return A[front];
    }

    public void print() {
        int count = (rear + MAX_SIZE - front) % MAX_SIZE + 1;
        System.out.println("Queue : ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % MAX_SIZE; // Index of element while traversing circularly from front
            System.out.print(A[index] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.enqueue(2);
       // Q.print();
        Q.enqueue(4);
       // Q.print();
        Q.enqueue(6);
       // Q.print();
        Q.dequeue();
       // Q.print();
        Q.enqueue(8);
       // Q.print();
    }
}