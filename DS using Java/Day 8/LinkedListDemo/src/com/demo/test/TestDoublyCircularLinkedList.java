package com.demo.test;

import com.demo.linkedlists.CircularDoublyLinkedList;

public class TestDoublyCircularLinkedList {

	public static void main(String[] args) {
		CircularDoublyLinkedList lst=new CircularDoublyLinkedList();
        lst.addNode(1);
   	    lst.addNode(2);
   	    lst.addNode(3);
   	    lst.addNode(4);
   	    lst.displayData();
   	    lst.addAfetrNum( 10,2);
  	    lst.addAfetrNum(10,4);
  	    System.out.println("after addAfterNum 2-10 and 4-10");
  	    lst.displayData();
  	     lst.addByPosition( 100,1);
    	 lst.addByPosition(100,4);
    	 System.out.println("after addByPosition 1-100 and 4-100");
    	 lst.displayData();
    	 lst.deleteByPosition(1);
       	 lst.deleteByPosition(3);
       	 System.out.println("after delete by position 1 and 3");
       	 lst.displayData();
     	 lst.deleteByValue(3);
       	 lst.deleteByValue(10);
       	 System.out.println("after delete by value 3 and 100");
       	 lst.displayData();
       	 lst.displayDataReverse();
	}

}
