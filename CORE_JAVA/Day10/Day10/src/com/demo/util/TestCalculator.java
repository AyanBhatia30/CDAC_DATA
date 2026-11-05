package com.demo.util;

import com.demo.model.Calculator;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		c.division(12, 2);
		
		c.division(12, 0);
		
		try {
			c.division1(14, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
