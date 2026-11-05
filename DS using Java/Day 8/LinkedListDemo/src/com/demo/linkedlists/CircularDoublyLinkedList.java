package com.demo.linkedlists;

public class CircularDoublyLinkedList {
    Node head;
    class Node{
 	   int data;
 	   Node prev,next;
		   public Node(int data) {
			super();
			this.data = data;
			this.prev = null;
			this.next = null;
		   }
    }
	   public CircularDoublyLinkedList() {
		     this.head = null;
	   }
      
	   public void addNode(int val) {
		   Node newnode=new Node(val);
		   if(head==null) {//if list is empty add at the head
			   head=newnode;
			   newnode.prev=newnode;
			   newnode.next=newnode;
		   }else {//add at the end
			   Node temp=head.prev; //place the temp at the end
			   newnode.next=temp.next;
			   temp.next=newnode;
			   newnode.prev=temp;
			   head.prev=newnode;
			   
		   }
		   
	   }
	   public void addByPosition(int val,int pos) {
		   if(head!=null) {
			   Node newnode=new Node(val); 
			   if(pos==1) { 
			    	 Node temp=head.prev;
			    	 head.prev=newnode;
			    	 temp.next=newnode;
			    	 newnode.next=head;
			    	 newnode.prev=temp;
			    	 head=newnode;
			     }else {
			    	 Node temp=head;
						//place temp at proper position , and add node after temp
						//add in between and add at the end
						int i=1;
						for(;temp.next!=head  && i<=pos-2;i++) {
							temp=temp.next;
						}
						if(i>pos-2) {
							newnode.next=temp.next;
							newnode.prev=temp;
							temp.next.prev=newnode;
							temp.next=newnode;
						}else {
							System.out.println("position is out of bounds");
						}
			     }
		   }else {
			   System.out.println("list is empty");
		   }
		   
	   }
	   
	   public void addAfetrNum(int val,int num) {
		   if(head==null) {
			   System.out.println("Empty list");
		   }else {
			   Node temp=head;
			   Node newnode=new Node(val);
			   while(temp.next!=head && temp.data!=num) {
				   temp=temp.next;
			   }
			   if(temp.data==num) {
				   newnode.next=temp.next;
					newnode.prev=temp;
					temp.next.prev=newnode;
					temp.next=newnode;
				}else {
					System.out.println(num+"num  not found");
				}
		   }
	   }
	   public int deleteByPosition(int pos) {
		    if(head!=null) {
		    	if(pos==1) {
		    		if(head.next==head) {
		    			int n=head.data;
		    			head=null;
		    			return n;
		    		}else {
		    			Node temp=head;
		    			Node tail=head.prev;
		    			head=head.next;
		    			tail.next=head;
		    			head.prev=tail;
		    			temp.next=null;
		    			temp.prev=null;
		    			return temp.data;
		    		}
		    	}else {
		    		Node temp=head;
		    		int i=1;
		    		for(;temp.next!=head && i<=pos-1;i++) {
		    			temp=temp.next;
		    		}
		    		if(i>pos-1) {
		    			temp.prev.next=temp.next;
						temp.next.prev=temp.prev;
						temp.prev=null;
						temp.next=null;
						return temp.data;
		    		}else {
		    			System.out.println(pos+" out of bounds");
		    		}
		    	}
		    }else {
		    	System.out.println("list is empty");
		    }
		    return -1;
	   }
	   public void deleteByValue(int val) {
		    if(head!=null) {
		    	if(head.data==val) {//delete from the beginning and list has only one node
		    		if(head.next==head) {
		    			head=null;
		    			
		    		}else {//delete from the beginning and list has many nodes
		    			Node temp=head;
		    			Node tail=head.prev;
		    			head=head.next;
		    			tail.next=head;
		    			head.prev=tail;
		    			temp.next=null;
		    			temp.prev=null;
		    		
		    		}
		    	}else {//delete from in between and at the end
		    		Node temp=head;
		    		while(temp.next!=head &&temp.data!=val) {
		    			temp=temp.next;
		    		}
		    		if(temp.data==val) {
		    			temp.prev.next=temp.next;
						temp.next.prev=temp.prev;
						temp.prev=null;
						temp.next=null;
		    		}else {
		    			System.out.println(val+" not found");
		    		}
		    	}
		    }else {
		    	System.out.println("list is empty");
		    }
		  
	   }
	   
	   public void displayData() {
			Node temp=head;
			do {
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}while(temp!=head);
			System.out.println("head");
		}
	   
	   public void displayDataReverse() {
			Node temp=head.prev;
			do {
				System.out.print(temp.data+"--->");
				temp=temp.prev;
			}while(temp!=head.prev);
			System.out.println();
		}



}
