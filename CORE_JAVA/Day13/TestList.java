package com.demo.test;
//Generics 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		//ArrayList   --- Object 
		// ordered   , duplicate data 
		List l  = new ArrayList();  //  raw type
		l.add(125);
		l.add("hello");
		l.add(123.456D);
		l.add(new Date());
		l.add("hello");
		System.out.println(l.size());
		System.out.println(l);// whole List
		// specific index data 
		System.out.println(l.get(1)); //  index 
		
		l.remove(4);// remove data using index 
		System.out.println(l);
		// search
		System.out.println("search : " + l.contains(125));
		
		//generic
		//List l  = new ArrayList();// Object   instanceof
		ArrayList<Integer> i = new ArrayList<Integer>();
		
		
		//List<Employee> lstEmployee  ; 
		
		
		
		
		
		
		
		
		
	}

}


