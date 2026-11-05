package com.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBuffer {
	
	File f ;

	public TestBuffer() {		
		f = new File("buffer.txt");
	}
	
	public void readFromFile() {
		
		try {
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);

			int d = bis.read();
			while(d != -1) {
				System.out.print((char)d);
				d = bis.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void writeOnFile() {
		
try {
	FileOutputStream fos = new FileOutputStream(f);
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	bos.write("Hello".getBytes());
	bos.flush();//bytes 
	System.out.println("Write Completed");
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
		TestBuffer t = new TestBuffer();
		//t.writeOnFile();
		t.readFromFile();
	}

}
