package com.demo.linkedlists;

public class DoublyLinkedList {
       Node head;
       class Node{
    	   int data;
    	   Node prev,next;
    	   public Node(int num) {
    		   data=num;
    		   prev=null;
    		   next=null;
    	   }
       }
       public DoublyLinkedList() {
    	   head=null;
       }
       
       public void addnode(int val) {
    	   Node newnode=new Node(val);
    	   //add at the begining
    	   if(head==null) {
    		   head=newnode;
    		   
    	   } else {
    		   //add at the end
    		   Node temp=head;
    		   //place temp at the last node
    		   while(temp.next!=null) {
    			   temp=temp.next;
    		   }
    		   temp.next=newnode;
    		   newnode.prev=temp;
    	   }
    	   }
       
       public void addByPosition(int val,int pos) {
    	   if(head!=null) {
    		   Node newnode=new Node(val);
    		 //add at the beginning  
    		   if(pos==1) {
        		   newnode.next=head;
        		   head.prev=newnode;
        		   head=newnode;
        	   }else {
        		   Node temp=head;
        		   for(int i=1;temp!=null && i<=pos-2;i++) {
        			   temp=temp.next;
        		   }
        		   if(temp!=null) {
        			   newnode.next=temp.next;
        			   newnode.prev=temp;
        			   temp.next=newnode;
        			   //add at the middle
        			   if(newnode.next!=null) {
        				   newnode.next.prev=newnode;
        			   }
        		   }
        	   }
    	   }else {
    		   System.out.println("list is empy");
    	   }
    	   
    	   
       }
       public void addAftergivenNum(int val,int num) {
    	   if(head!=null) {
    		   Node newnode=new Node(val);
    		   Node temp=head;
    		   while(temp!=null && temp.data!=num) {
    			   temp=temp.next;
    		   }
    		   if(temp!=null && temp.data==num) {
    			   newnode.next=temp.next;
    			   newnode.prev=temp;
    			   temp.next=newnode;
    			   if(newnode.next!=null)
    				   newnode.next.prev=newnode;
    		   }
    		   
    		   
    	   }else {
    		   System.out.println("list is empy");
    	   }
       }
       
       public void addBeforegivenNum(int val,int num) {
    	   if(head!=null) {
    		   Node newnode=new Node(val);
    		   if(head.data==num) {
    			   newnode.next=head;
    			   head.prev=newnode;
    			   head=newnode;
    			   
    		   }else {
		    		   Node temp=head;
		    		   while(temp!=null && temp.data!=num) {
		    			   temp=temp.next;
		    		   }
		    		   if(temp!=null && temp.data==num) {
		    			   newnode.prev=temp.prev;
		    			   temp.prev.next=newnode;
		    			   newnode.next=temp;
		    			   temp.prev=newnode;
		    		   }
    		   }
    		   
    	   }else {
    		   System.out.println("list is empy");
    	   }
       }
       public void deleteByValue(int val) {
    	   if(head!=null) {
    		   if(head.data==val) {
    			   Node temp=head;
    			   head=head.next;
    			   head.prev=null;  
    			   temp.next=null;
    			   
    		   }else {
    			   Node temp=head;
    			   while(temp!=null && temp.data!=val) {
    				   temp=temp.next;
    				   
    			   }
    			   if(temp!=null && temp.data==val) {
    				   if(temp.next!=null)
    				          temp.next.prev=temp.prev;
    				   temp.prev.next=temp.next;
    				   temp.next=null;
    				   temp.prev=null;
    			   }else {
    				   System.out.println(val+"  not found");
    			   }
    		   }
    		   
    	   }else {
    		   System.out.println("list is empy");
    	   }
    	   
       }
       public void deleteByPosition(int pos) {
    	   if(head!=null) {
    		   if(pos==1) {
    			   Node temp=head;
    			   head=head.next;
    			   head.prev=null;  
    			   temp.next=null;
    			   
    		   }else {
    			   Node temp=head;
    			  for(int i=1;temp!=null && i<=pos-1;i++) {
    				   temp=temp.next;	   
    			   }
    			   if(temp!=null ) {
    				   if(temp.next!=null) {
    				          temp.next.prev=temp.prev;
    				   }
    				   temp.prev.next=temp.next;
    				   temp.next=null;
    				   temp.prev=null;
    			   }else {
    				   System.out.println(pos+" not found");
    			   }
    		   }
    		   
    	   }else {
    		   System.out.println("list is empy");
    	   }
       }
       
       public void displayAll() {
    	   if(head!=null) {
    		       for(Node temp=head;temp!=null;temp=temp.next) {
    		    	     System.out.print(temp.data+"----->");
    		       }
    		       System.out.println("null");
    		   
    	   }else{
    		   System.out.println("list is empty");
    	   }
       }
       
       public void displayAllReverse() {
    	   //place temp at the last node
    	   /*Node temp=head;
    	   while(temp.next!=null) {
    		   temp=temp.next;
    	   }*/
    	   Node temp;
    	   for( temp=head;temp.next!=null;temp=temp.next);
    	   while(temp!=null) {
    		   System.out.print(temp.data+"---->");
    		   temp=temp.prev;
    	   }
    	   System.out.println("null");
       }
}
