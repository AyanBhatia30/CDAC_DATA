package com.demo.test;

import com.demo.model.Person;
import com.demo.model.SalariedEmployee;
import com.demo.shape.Circle;
import com.demo.shape.Square;
import com.demo.util.Printable;

public class TestInterface {
	
	public static void showData(Printable p ) {
		
			p.print();
			
			
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Printable.count);
		
		SalariedEmployee se = new SalariedEmployee();
		showData(se);
		
		Circle c = new Circle();
		showData(c);
		
		
		
		Square s = new Square();
		showData(s);
		
		
		Object o = new Person();
		Person p = new Person();
		Person p1 = new SalariedEmployee();
		
		Printable pr ;//= new Printable();
		pr = new SalariedEmployee();
		
		
		// abstract class                 Interface 
		// abstract methods , can not create an Object
		// ref variable 
		
		
		// single abstract class can be parent class 
		// implement multiple interface 
		
		
		
		
		
		
		
		
		
		
		

	}

}
