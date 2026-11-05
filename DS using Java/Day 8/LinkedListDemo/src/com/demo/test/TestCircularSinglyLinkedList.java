package com.demo.test;

import com.demo.linkedlists.CircularSinglyLinkedList;

public class TestCircularSinglyLinkedList {

	public static void main(String[] args) {
		CircularSinglyLinkedList lst=new CircularSinglyLinkedList();
		 lst.addNode(1);
		 lst.addNode(2);
		 lst.addNode(3);
		 lst.addNode(4);
		 lst.displayAll();
		 lst.addAfterGivennum(10,2);
		 lst.addAfterGivennum(10,4);
		 System.out.println("after addAfterNum 2-10 and 4-10");
		 lst.displayAll();
		 lst.addByPosition(100,1);
		 lst.addByPosition(100,4);
		 lst.addByPosition(100,9);
		 System.out.println("after addByPosition 1-100 and 4-100");
		 lst.displayAll();
		 lst.deleteByPosition(1);
		 lst.deleteByPosition(3);
		 System.out.println("after delete by position 1 and 3");
		 lst.displayAll();
		 lst.deleteByValue(3);
		 lst.deleteByValue(100);
		 System.out.println("after delete by value 3 and 100");
		 lst.displayAll();
		 
		 
	}

}
