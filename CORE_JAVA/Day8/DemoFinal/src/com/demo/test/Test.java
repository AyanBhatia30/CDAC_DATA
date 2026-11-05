package com.demo.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "ABCDEFHIJKLMNOPQRSTUVWXYZ";
		System.out.println(Math.random());// double
		System.out.println(data.charAt((int) (Math.random() * 10)));
		int limit = 8;
		StringBuffer sb = new StringBuffer();
		do {
			sb.append(data.charAt((int) (Math.random() * 10)));
		} while (sb.length() != limit);
		System.out.println(sb);
	}

}
