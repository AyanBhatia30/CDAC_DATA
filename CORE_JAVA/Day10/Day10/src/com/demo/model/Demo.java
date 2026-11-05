package com.demo.model;

public class Demo {
	
	int i  = 100;  // instance 
	static Demo temp = null;		
	private Demo() {
		System.out.println("Demo Default Constructor");
	}	
	public static  Demo getObject() {
		if(temp == null) {
			temp = new Demo();
			return temp;
		}
		return temp;
	}
	
	
	// kind of memory location 
	//  HashSet   HashMap 
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 125;///100
	}

}






