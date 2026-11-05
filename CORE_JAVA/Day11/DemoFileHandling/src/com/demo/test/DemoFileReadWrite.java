package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileReadWrite {
	// Stream    flow of Bytes 	
	public static void readData() {
		
		// File  ---   Java InputStream  
		File f = new File("sample.txt");		
		try {
			FileInputStream fis  = new FileInputStream(f);
			int data = fis.read();	// ascii  single byte 		
			//System.out.println("FROM File " + (char)data);
			// EOF -1			
			while(data != -1) {			
				System.out.print((char)data);
				data = fis.read();
			}
			//data = fis.read();	// ascii  single byte 		
			//System.out.println("FROM File " + (char)data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		File f = new File("sample.txt");// current 
		try {// write -- fresh file 
			// true  append mode
			String s = "Hello World";  // bytes array 
			FileOutputStream fos = new FileOutputStream(f , true);
			//fos.write(s.getBytes());
			//fos.write(65);	// A	ascii of value 	
			//System.out.println("task completed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		readData();

	}

}
