package com.demo.stacks;


//Custom Node class to hold the data, priority, and next reference
class Node {
 int data;
 int priority;
 Node next;

 public Node(int data, int priority) {
     this.data = data;
     this.priority = priority;
     this.next = null;
 }
}

//Priority Queue implementation
public class MyPriorityQueue {
 private Node front;

 public MyPriorityQueue() {
     this.front = null;
 }

 // Enqueue operation: Inserts an item based on its priority
 public void enqueue(int data, int priority) {
     Node newNode = new Node(data, priority);

     // Case 1: The queue is empty OR the new node has higher priority than the front node
     if (front == null || priority < front.priority) {
         newNode.next = front;
         front = newNode;
         System.out.println("Enqueued: " + data + " (Priority: " + priority + ")");
         return;
     }

     // Case 2: Traverse the list to find the correct sorted position
     Node current = front;
     while (current.next != null && current.next.priority <= priority) {
         current = current.next;
     }

     // Insert the new node
     newNode.next = current.next;
     current.next = newNode;
     System.out.println("Enqueued: " + data + " (Priority: " + priority + ")");
 }

 // Dequeue operation: Removes and returns the element with the highest priority
 public int dequeue() {
     if (isEmpty()) {
         System.out.println("Queue Underflow! The queue is empty.");
         return -1; 
     }

     // The front node always holds the highest priority item
     int removedData = front.data;
     front = front.next;
     return removedData;
 }

 // Peek operation: Looks at the highest priority element without removing it
 public int peek() {
     if (isEmpty()) {
         System.out.println("Queue is empty.");
         return -1;
     }
     return front.data;
 }

 // Utility operation: Check if the queue is empty
 public boolean isEmpty() {
     return front == null;
 }

 // Utility operation: Display the entire queue status
 public void display() {
     if (isEmpty()) {
         System.out.println("Queue is empty.");
         return;
     }
     Node temp = front;
     System.out.print("Priority Queue: ");
     while (temp != null) {
         System.out.print("[" + temp.data + ", P:" + temp.priority + "] -> ");
         temp = temp.next;
     }
     System.out.println("null");
 }

 // Main method to test the functionality
 public static void main(String[] args) {
     MyPriorityQueue 
pq = new  MyPriorityQueue();

     pq.enqueue(30, 3);
     pq.enqueue(10, 1);
     pq.enqueue(40, 4);
     pq.enqueue(20, 2);
     pq.enqueue(15, 1); // Testing identical priority order

     pq.display();

     System.out.println("Dequeued item: " + pq.dequeue());
     System.out.println("Dequeued item: " + pq.dequeue());
     
     pq.display();
     
     System.out.println("Peek highest priority: " + pq.peek());
 }
}


