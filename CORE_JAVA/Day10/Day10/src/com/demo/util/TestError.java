package com.demo.util;

public class TestError {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		String s = "a";
		int i  = Integer.parseInt(s);//runtime error   		
		System.out.println(i);
		System.out.println("Main End");

	}

}
