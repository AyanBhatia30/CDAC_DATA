package com.demo.linkedlists;

public class SinglyLinkedList {
     Node head;
         class Node{
        	 int data;
        	 Node next;
        	 public Node(int n) {
        		 data=n;
        		 next=null;
        	 }
         }
         public SinglyLinkedList() {
        	 head=null;
         }
         
         //add a node at the end
         public void addNode(int val) {
        	 Node newNode=new Node(val);
        	 //if list is empty
        	 if(head==null) {
        		  head=newNode;
        	 }else {
        		 //place the temp at the last node
        		 Node temp=head;
        		 while(temp.next!=null) {
        			 temp=temp.next;
        		 }
        		 temp.next=newNode;
        	 }
        	 
         }
         public void addByPosition(int val,int pos) {
        	 if(head!=null) {
        		 Node newNode=new Node(val);
        		 //add before firstNode
        		 if(pos==1) {
        			 newNode.next=head;
        			 head=newNode;
        		 }else {
        			 Node temp=head;
        			 for(int i=1;temp!=null && i<=pos-2;i++) {
        				 temp=temp.next;
        			 }
        			 if(temp!=null) {
        				 newNode.next=temp.next;
        				  temp.next=newNode;
        			 }
        		 }	 
        	 }else {
        		 System.out.println("list is empty");
        	 }
         }
         
         //add after given number
         public void addAfterGivenNumber(int val,int num) {
        	   Node temp=head;
        	   while(temp!=null && temp.data!=num) {
        		      temp=temp.next;
        	   }
        	   if(temp!=null && temp.data==num) {
        		   Node newNode=new Node(val);
            	   newNode.next=temp.next;
            	   temp.next=newNode;
        	   }else {
        		   System.out.println("Number not found");
        	   }
        	  
         }
         
         public void addBeforeGivenNumber(int val,int num) {
        	 Node newNode=new Node(val);
        	 //check whether to add  before first node
        	 if(head.data==num) {
        		 newNode.next=head;
        		 head=newNode;
        	 }else {
        		 Node prev=head;
        		 Node temp=prev.next;
        		 while(temp!=null && temp.data!=num) {
        			 prev=temp;
        			 temp=temp.next;
        		 }
        		 if(temp!=null && temp.data==num) {
        			 newNode.next=temp;
        			 prev.next=newNode;
        		 }else {
        			 System.out.println("Not found");
        		 }
        		 
        		 
        	 }
         }
         
         //Write function deleteByValue, to delete given number
         //write a function deleteByPosition to delete the node at given position
         public void displayAll(){
        	  for(Node temp=head;temp!=null;temp=temp.next) {
        		      System.out.print(temp.data+"----->");
        	  }
        	  System.out.println("null");
         }
}
