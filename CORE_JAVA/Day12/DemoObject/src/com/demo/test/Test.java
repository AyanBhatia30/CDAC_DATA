package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.model.Employee;

public class Test {
	
	File f ; 

	public Test() {
		f = new File("Employee.txt");
	}
	
	public void readData() {
		
		try {
			FileInputStream fis = new FileInputStream("Employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//  EOF 
			Employee temp = (Employee) ois.readObject();
			System.out.println("From File  : " + temp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void writeData(Employee d) {
		System.out.println("in writeData");
		try {
			FileOutputStream fos = new FileOutputStream(f , true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);		
			oos.writeObject(d);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("main");
		Test t = new Test();		
		//Employee e = new Employee(101, "abc", 1245695.0f);		
		//t.writeData(e);
		
		//t.readData();
		
		Employee empArr[]  = new Employee[3];
		empArr[0] =  new Employee(101, "a101", 1245695.0f);	
		empArr[1] =  new Employee(102, "b102", 45695.0f);
		empArr[2] =  new Employee(103, "c103", 15695.0f);
		
		t.writeData(empArr[0]);
		t.writeData(empArr[1]);
		t.writeData(empArr[2]);
		
		t.readData();  //  whole file 
	}

}






