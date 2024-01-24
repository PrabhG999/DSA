package Queue;


public class Queue {
    int queue[] = new int[5];
    int front;
    int rear;
    int size;

    // Method to enqueue an element into the queue
    void enqueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5; // Increment rear with the modulus of the size of the queue
            size++;
        } else {
            System.out.println("Queue is full. Cannot enqueue " + data);
        }
    }

    // Method to dequeue an element from the queue
    int dequeue() {
        if (!isEmpty()) {
            int data = queue[front];
            front = (front + 1) % 5;
            size--;
            return data;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return an error value
        }
    }

    // Method to get the current size of the queue
    int getSize() {
        return size;
    }

    // Method to check if the queue is empty
    boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    boolean isFull() {
        return size == 5;
    }

    // Method to display the elements in the queue
    void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 5] + " ");
        }
        System.out.println();
    }

}
