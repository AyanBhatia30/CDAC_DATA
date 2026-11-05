package com.demo.test;

import com.demo.linkedlists.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		list.addnode(12);
		list.addnode(15);
		list.addnode(7);
		list.displayAll();
		list.displayAllReverse();
		list.addAftergivenNum(11, 12);
		list.addAftergivenNum(8, 7);
		list.displayAll();
		list.addBeforegivenNum(15, 12);
		list.addBeforegivenNum(100, 8);
		list.addBeforegivenNum(100, 300);
		list.displayAll();
		list.deleteByPosition(7);
		list.deleteByPosition(15);
		list.deleteByPosition(1);
		list.deleteByPosition(3);
		list.displayAll();
		list.deleteByValue(11);
		list.deleteByValue(8);
		list.displayAll();
	}

}
