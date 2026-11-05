package com.demo.test;
import java.util.Collections;

import com.demo.util.Printable;
import com.demo.util.Printable2;

public class Test {

	public static void main(String[] args) {
// Class A imple Printable
		Printable p = new Printable() {			
			@Override
			public void print() {
				System.out.println("From Printable Class");	
			}
		};		
		p.print();
		
	Printable p1 = () -> {System.out.println("Hello");};
		p1.print();
		
	//Printable2 p2 = (msg) -> {System.out.println("Hello "+msg);};
	//p2.print("Good Morning");
	//Printable2.getData();
	//p2.m();
		
	Printable2 add = (i1 , i2 ) -> {System.out.println(i1+i2);};
	add.print(12, 23);	
	add.print(32, 45);
	
	//Collections.sort((Object o1 , Object o2) ->	{ return o2.compare(o1)};);	
		
		
		
		
		

	}

}
