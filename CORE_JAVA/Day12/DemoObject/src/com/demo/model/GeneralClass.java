package com.demo.model;

public class GeneralClass {
	
	Object o1  , o2 ;// data of any type 

	public GeneralClass() {
		// TODO Auto-generated constructor stub
	}	
	
	public GeneralClass(Object o1, Object o2) {
		super();
		this.o1 = o1;
		this.o2 = o2;
	}

	//  int float  double byte short long 
	public Object add() {		
		if(o1 instanceof Integer ) {
		int i1  = (Integer) o1;
		int i2  = (Integer) o2;		
		return  i1+ i2;//Integer.parseInt(o1)+o2;
		}		
		return 0;
	}
	
	public static void main(String[] args) {
		GeneralClass g = new GeneralClass(100, 125);
		System.out.println(g.add());
		
		g = new GeneralClass(100.12, 125.48);// double 
		System.out.println(g.add());//classcastexception

	}

}
