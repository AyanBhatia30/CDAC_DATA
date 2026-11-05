package com.demo.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> v  = new LinkedList<String>();
		
		//System.out.println("capacity : " + v.capacity());
		
		System.out.println("size : " + v.size());		
		v.add("A");
		v.add("A");		
	///	System.out.println("capacity : " + v.capacity());
		v.add("B");
		v.add("C");
		System.out.println(v); // whole vector  [  ]  
		System.out.println("size : " + v.size());
		
		System.out.println(v.get(2));  //  index 
		
		System.out.println("\n\nvector using for loop");
		//  index    for Reverse order 
		for (int i = v.size()-1; i >= 0 ;  i--) {
			System.out.println(v.get(i));
		}		
		// for each loop -- Forward  start to end   Print
		System.out.println("\n\n using for each loop  ");
		for(String s : v) {			
				System.out.println(s);
		}
		//  Iterator  --- traverse  your collection 
		System.out.println("\n\n using iterator  forward  ");
		Iterator<String> i = v.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());				
			}
			
			
		v.remove(1); // index  array    4   
		
		System.out.println(v);
		
		v.remove("B");// Object 
		
		System.out.println(v);
		
		System.out.println(v.contains("C"));
		

	}

}








