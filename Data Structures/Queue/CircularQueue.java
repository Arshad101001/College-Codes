import java.util.*;

class CircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;

    // Constructor to initialize the queue
    public CircularQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = 0;
        this.rear = 0;
    }

    // check if queue is full
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // check if queue is empty
    public boolean isEmpty() {
        return front == rear;
    }

    //add an element to the queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is Full. Cannot enqueue " + element);
            return;
        }
        queue[rear] = element;
        rear = (rear + 1) % size;
        System.out.println("Enqueued: " + element);
    }

    // Remove and return the front element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int element = queue[front];
        front = (front + 1) % size;
        System.out.println("Dequeued: " + element);
        return element;
    }

    // peek the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println();
    }

    // main method to test the circular queue with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue: ");
        int size = sc.nextInt();

        CircularQueue cq = new CircularQueue(size);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to enqueue: ");
                    int element = sc.nextInt();
                    cq.enqueue(element);
                    break;
                case 2:
                    cq.dequeue();
                    break;
                case 3:
                    int frontelement = cq.peek();
                    if (frontelement != -1) {
                        System.out.println("Front Element: " + frontelement);
                    }
                    break;
                case 4:
                    cq.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Input. Try Again.");
            }
        }
    }
}
