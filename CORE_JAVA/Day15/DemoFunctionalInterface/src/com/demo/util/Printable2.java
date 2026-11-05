package com.demo.util;

@FunctionalInterface// optional 
public interface Printable2 {	
	void print(Integer i1 , Integer i2  );
	
	//void print(String s  );
	
	default void m() {
		System.out.println("m");
	}
	
	default void m1() {
		System.out.println("m1");
	}
	
	public static void getData() {
		System.out.println("getData");
	}

}
