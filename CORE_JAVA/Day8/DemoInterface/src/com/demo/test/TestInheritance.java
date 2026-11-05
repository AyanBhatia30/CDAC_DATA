package com.demo.test;

import com.demo.model.ContractEmployee;
import com.demo.model.SalariedEmployee;
import com.demo.shape.Circle;
import com.demo.shape.Square;

public class TestInheritance {

	public static void showData(Object    temp)
	{
			// print()
			//temp.print();		
		if(temp instanceof SalariedEmployee) {			
			SalariedEmployee se = (SalariedEmployee) temp;
			se.print();
		}
		
		if(temp instanceof Circle) {
			
			Circle c = (Circle) temp;
			c.print();
		}
		
		if(temp instanceof Square)
		{    Square s = (Square)temp ; 
				s.print();
		}

		
	}
	public static void main(String[] args) {
		SalariedEmployee se = new SalariedEmployee();
		showData(se);
		
		Circle c = new Circle();
		showData(c);
		
		Square s = new Square();
		showData(s);
		
		ContractEmployee ce = new ContractEmployee();
		showData(ce);
	}

}





