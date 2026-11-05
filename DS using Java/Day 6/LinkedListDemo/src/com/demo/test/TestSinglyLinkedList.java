package com.demo.test;

import com.demo.linkedlists.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
		list.addNode(10);
		list.addNode(11);
		list.addNode(7);
		list.addNode(8);
		list.addByPosition(100, 5);
		list.addByPosition(200, 3);
		list.addByPosition(300, 1);
		list.addAfterGivenNumber(110,11);
		list.addAfterGivenNumber(101, 100);
		list.addAfterGivenNumber(230, 22);
		list.displayAll();

	}

}
