package com.demo.test;

import com.demo.stacks.MyPriorityQueue;

public class TestPriorityQueue {
	public static void main(String[] args) {
        MyPriorityQueue pq = new  MyPriorityQueue();

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
        pq.display();
    }
}
