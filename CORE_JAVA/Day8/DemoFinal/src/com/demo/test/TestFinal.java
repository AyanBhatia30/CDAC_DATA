package com.demo.test;

import com.demo.model.MyDate;

public class TestFinal {

	
	
	public static void main(String[] args) {
		// final  -  assigned value at least once 
		final int c ;
		c = 145;
		System.out.println(c);
		
		final String s = new String("Sample");
		//s = new String("New");
		
		//c = 126;
		
		MyDate d1 = new MyDate(15, 8, 2026);
		
		final MyDate dFinal = new MyDate(15, 8, 2026);
		System.out.println(dFinal);
		dFinal.setDay(25);
		System.out.println(dFinal);
		//dFinal = new MyDate(25, 8, 2026);
		
		// final class 

	}

}





