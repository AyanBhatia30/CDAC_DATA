package com.demo.test;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \ escape seq
		System.out.println("\n\n\n");
		File f = new File("C:/Users/Admin/Desktop/CoreJava2408/data2408.txt.txt");
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		
		System.out.println(f.isDirectory());
		//no path ---  current directory 
		
		// File and Directory 
		File f1 = new File("data.txt");
		if(f1.exists()) {
			System.out.println(f1.canRead());
		} else  { 
			System.out.println("in else ");
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
