package com.demo.model;
// Generics   T  type  ----    Compiler 
public class GeneralClassType <T> {	
	T o;	//Integer   String 
	public GeneralClassType(T o) {
		this.o = o;
	}
	public void showType() {		
		System.out.println(o.getClass());
	}	
	//wild card ---  Method  
	public void addition(T o) {
		
		
	}
	public static void main(String[] args) {
		GeneralClassType<Integer> g 
		= new GeneralClassType<Integer>(100);
		g.showType();
		g.addition(152);
		GeneralClassType<String> gs 
		= new GeneralClassType<String>("Hello");
		gs.showType();		
		GeneralClassType<Employee> ge 
		= new GeneralClassType<Employee>(new Employee());
		ge.showType();  // Employee
		ge.addition(new Employee());
	}
}






