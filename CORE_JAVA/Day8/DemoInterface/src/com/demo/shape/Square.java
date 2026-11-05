package com.demo.shape;

import com.demo.util.MyInterface;
import com.demo.util.Printable;

public class Square extends Shape 
implements Printable , MyInterface {

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub

	}
	
	public void print() {
		
		System.out.println("in Square print ");
		
		
	}

	@Override
	public void showMyData() {
		// TODO Auto-generated method stub
		
	}

}
