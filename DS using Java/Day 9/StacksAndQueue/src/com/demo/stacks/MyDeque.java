package com.demo.stacks;


public class MyDeque<T> {
    
    // Internal node structure for the Doubly Linked List
    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public MyDeque() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Return the size of the deque
    public int size() {
        return size;
    }

    // Add an element to the front
    public void insertFront(T item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    // Add an element to the rear
    public void insertRear(T item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Remove and return an element from the front
    public T deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque Underflow: Cannot delete from front.");
            return null;
        }
        T data = front.data;
        front = front.next;
        
        if (front == null) {
            rear = null; // Deque became empty
        } else {
            front.prev = null;
        }
        size--;
        return data;
    }

    // Remove and return an element from the rear
    public T deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque Underflow: Cannot delete from rear.");
            return null;
        }
        T data = rear.data;
        rear = rear.prev;

        if (rear == null) {
            front = null; // Deque became empty
        } else {
            rear.next = null;
        }
        size--;
        return data;
    }

    // Get the front element without removing it
    public T getFront() {
        if (isEmpty()) return null;
        return front.data;
    }

    // Get the rear element without removing it
    public T getRear() {
        if (isEmpty()) return null;
        return rear.data;
    }

    // Display the items inside the Deque
    public void display() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }
        Node current = front;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data + (current.next != null ? ", " : ""));
            current = current.next;
        }
        System.out.println("]");
    }

    // Main method to test functionality
    public static void main(String[] args) {
       MyDeque<Integer> dq = new MyDeque<>();

        System.out.println("Inserting 10 and 20 at the rear...");
        dq.insertRear(10);
        dq.insertRear(20);
        dq.display(); // Output: [10, 20]

        System.out.println("Inserting 5 at the front...");
        dq.insertFront(5);
        dq.display(); // Output: [5, 10, 20]

        System.out.println("Deleted from front: " + dq.deleteFront()); // Output: 5
        dq.display(); // Output: [10, 20]

        System.out.println("Deleted from rear: " + dq.deleteRear());   // Output: 20
        dq.display(); // Output: [10]

        System.out.println("Front element: " + dq.getFront()); // Output: 10
    }
}


