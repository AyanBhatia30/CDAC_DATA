package com.demo.util;

import com.demo.model.Demo;

public class TestSingetone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d ; //= new Demo();
		d = Demo.getObject();
		System.out.println(d);
		
		Demo d1 = Demo.getObject();
		System.out.println(d1);
		
		
		
	}

}
