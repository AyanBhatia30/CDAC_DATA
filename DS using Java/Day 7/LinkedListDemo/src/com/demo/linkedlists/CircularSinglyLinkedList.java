package com.demo.linkedlists;

public class CircularSinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int num) {
			  data=num;
			  next=null;
		}
	}
	
	public CircularSinglyLinkedList() {
		head=null;
	}
	
	//add at the end
	public void addNode(int val) {
		Node newnode=new Node(val);
		//add at the beginning
		if(head==null) {
			head=newnode;
			newnode.next=head;
		}else {
			//add at then end
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
	}
	public void addAfterGivennum(int val,int num) {
		
	}
	
	public void displayAll() {
		Node temp=head;
		do {
			System.out.println(temp.data+"------>");
			temp=temp.next;
		}while(temp!=head);
	
	}

}
