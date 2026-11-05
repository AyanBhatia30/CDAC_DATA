package com.demo.test;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataInputOutput {
	
	File file ; 

	public TestDataInputOutput() {
		file = new File("data1.txt");
	}
	
	public void readData() {
		
		try {
			FileInputStream fis  = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeData() {
		
		int i = 123;
		float f = 23.3f;
		if(file.canWrite()) {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			//BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(fos);			
			dos.writeInt(i);// int 4
			dos.writeFloat(f);  //  float 
			//dos.writeUTF("Hello ");  // String 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else {
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestDataInputOutput().writeData();
		new TestDataInputOutput().readData();
	}

}
