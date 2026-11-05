package com.demo.linkedlists;

import com.demo.linkedlists.SinglyLinkedList.Node;

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
			newnode.next=temp.next;  //newnode will point to head node
			temp.next=newnode;
		}
	}
	public void addByPosition(int val,int pos) {
		if(head!=null) {
			Node newnode=new Node(val);
			Node temp=head;
			if(pos==1) {	
				//place temp at the last position
				while(temp.next!=head) {
					temp=temp.next;
				}
				newnode.next=head;
				head=newnode;
				temp.next=newnode;	
			}else {
				int i=1;
				for(;temp.next!=head && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(i>pos-2) {
					newnode.next=temp.next;
					temp.next=newnode;
				}
			}
		}else {
     		 System.out.println("list is empty");
     	 }
	}
	public void addAfterGivennum(int val,int num) {
		 if(head!=null) {
			   Node newnode=new Node(val);
		      Node temp=head;
		      do {
		      			 if(temp.data==num) { //if the data found then break the loop
		      				 break;
		      			 }
		     		      temp=temp.next;
		     	   } while(temp!=head);
		     	   if(temp.data==num ) { //if data found add node after the node
		         	   newnode.next=temp.next;
		         	   temp.next=newnode;
		     	   }else {
		     		   System.out.println("Number not found");
		     	   }
      	   }else {
      		 System.out.println("list is empty");
      	 }
	}
	public int deleteByPosition(int pos) {
		if(head!=null) {
			if(pos==1) {
				if(head.next==head) { //only one node in the list
					  head=null;
				}else { //delete from the begining and list has more than one node
					Node tail=head;
					Node temp=head;
					while(tail.next!=head) {
						tail=tail.next;
					}
					head=head.next;
					tail.next=head;
					temp.next=null;
					return temp.data;
				}}else{
					Node prev=head;
					Node temp=head.next;
					int i=1;
					while(temp!=head && i<=pos-2) {//place temp at position and prev before temp
						  prev=temp;
						  temp=temp.next;
						  i++;
					}
					if(temp!=head) { //if found the position delete temp node
						prev.next=temp.next;
						temp.next=null;
						return temp.data;
					}else {
						System.out.println("number not found");
					}
			}
		}else {
     		 System.out.println("list is empty");
     	 }
		return -1;
	}
	
	
	public int deleteByValue(int val) {
		if(head!=null) {
			if(head.data==val) {
				if(head.next==head) { //only one node in the list
					  head=null;
				}else { //delete from the begining and list has more than one node
					Node tail=head;
					Node temp=head;
					while(tail.next!=head) { //place tail at the last node
						tail=tail.next;
					}
					head=head.next;
					tail.next=head;
					temp.next=null;
					return temp.data;
				}}else{
					Node prev=head;
					Node temp=head.next;
					int i=1;
					while(temp!=head && temp.data!=val) {//place temp at position and prev before temp
						  prev=temp;
						  temp=temp.next;
						  i++;
					}
					if(temp!=head) { //if found the value then delete temp node
						prev.next=temp.next;
						temp.next=null;
						return temp.data;
					}else {
						System.out.println("number not found");
					}
			}
		}else {
     		 System.out.println("list is empty");
     	 }
		return -1;
	}
	
	public void displayAll() {
		Node temp=head;
		do {
			System.out.print(temp.data+"------>");
			temp=temp.next;
		}while(temp!=head);
	      System.out.println("head");
	}

}
