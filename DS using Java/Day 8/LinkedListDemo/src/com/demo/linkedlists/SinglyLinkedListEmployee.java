package com.demo.linkedlists;

import com.demo.beans.Employee;
import com.demo.linkedlists.SinglyLinkedList.Node;

public class SinglyLinkedListEmployee {
	 Node head;
     class Node{
    	 Employee data;
    	 Node next;
    	 public Node(Employee ob) {
    		 data=ob;
    		 next=null;
    	 }
     }
     public SinglyLinkedListEmployee() {
    	 head=null;
     }
     
     //add a node at the end
     public void addNode(Employee val) {
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
     public void addByPosition(Employee val,int pos) {
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
    			 //add in between and add at the end
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
     public void addAfterGivenId(Employee val,int num) {
    	 if(head!=null) {
    	   Node temp=head;
    	   while(temp!=null && temp.data.getEid()!=num) {
    		      temp=temp.next;
    	   }
    	   if(temp!=null && temp.data.getEid()==num) {
    		   Node newNode=new Node(val);
        	   newNode.next=temp.next;
        	   temp.next=newNode;
    	   }else {
    		   System.out.println(num+"Employee  not found");
    	   }
    	 }else {
    		 System.out.println("list is empty");
    	 }
     }
     
     public void addBeforeGivenId(Employee val,int num) {
    	 Node newNode=new Node(val);
    	 if(head!=null) {
				        	 //check whether to add  before first node
				        	 if(head.data.getEid()==num) {
				        		 newNode.next=head;
				        		 head=newNode;
				        	 }else {
				        		 Node prev=head;
				        		 Node temp=prev.next;
				        		 while(temp!=null && temp.data.getEid()!=num) {
				        			 prev=temp;
				        			 temp=temp.next;
				        		 }
				        		 if(temp!=null && temp.data.getEid()==num) {
				        			 newNode.next=prev.next;
				        			 prev.next=newNode;
				        		 }else {
				        			 System.out.println("Not found");
				        		 }
				        	 }
    	 }else {
    		 System.out.println("list is empy");
    	 }
    		 
    		 
    	 }
     
     
     //Write function deleteByValue, to delete given number
     public void deleteById(int val) {
    	 if(head!=null) {
    		
    		 //delete from the beginning
    		 if(head.data.getEid()==val) {
    			 Node temp=head;
    			 head=head.next;
    			 temp.next=null;
    		 }else {
    			 Node prev=head;
    			  Node temp=prev.next;
    			  while(temp!=null && temp.data.getEid() !=val) {
    				  prev=temp;
    				  temp=temp.next;
    			  }
    			  if(temp!=null && temp.data.getEid()==val) {
    				  prev.next=temp.next;
    				  temp.next=null;
    			  }else {
    				  System.out.println(val+ "Employee  Not found");
    			  }
    		 }
    	 }else {
    		 System.out.println("list is empty");
    	 }
     }
     //write a function deleteByPosition to delete the node at given position
     public void deleteByPosition(int pos) {
    	 if(head!=null) {
    		 //delete from the beginning
    		 if(pos==1) {
    			 Node temp=head;
    			 head=head.next;
    			 temp.next=null;
    		 }else {
    			 //delete from in between or end
    			 Node prev=head;
    			 Node temp=prev.next;
    			 for(int i=1;temp!=null && i<=pos-2;i++) {
    				    prev=temp;
    				    temp=temp.next;
    			 }
    			 if(temp!=null) {
    				 prev.next=temp.next;
    				 temp.next=null;
    			 }else {
    				 System.out.println("Position is out of bounds");
    			 }
    		 }
    		 
    	 }else {
    		 System.out.println("List is empty");
    	 }
     }
     
     
     public void displayAll(){
    	  for(Node temp=head;temp!=null;temp=temp.next) {
    		      System.out.println(temp.data);
    	  }
    	  System.out.println("null");
     }
}
