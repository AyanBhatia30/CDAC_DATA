package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestClose {
//Byte images 
// char  doc
	public TestClose() {
	// try with resource // close()  implicite	
try (FileInputStream fis = new FileInputStream("data.txt");)
{			 
			int i = fis.read();
			System.out.println("From File " + (char) i);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis  = null ;
		try {
			 fis = new FileInputStream("data.txt");
			int i = fis.read();
			System.out.println("From File " + (char) i);
			
			//fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
