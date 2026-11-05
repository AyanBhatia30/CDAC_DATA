package com.demo.test;

import com.demo.arrays.MyArray;

public class Test1DArray {

	public static void main(String[] args) {
		MyArray ob=new MyArray();
		MyArray ob1=new MyArray(12);
		int[] arr= {12,3,1,2,4,5,23,45,67};
		MyArray ob2=new MyArray(arr,arr.length);
		ob.add(5);
		System.out.println(ob);
		ob.add(10);
		System.out.println(ob);
		ob.add(2,1);
		System.out.println(ob2.deleteByPosition(arr.length-1));
		
		//ob2.findMax();
		System.out.println(ob2);
		System.out.println(ob2.deleteByPosition(2));
		System.out.println(ob2);
		System.out.println(ob2.deleteByPosition(0));
		System.out.println(ob2.deleteByPosition(100));
		System.out.println(ob2);
		//System.out.println(ob1);
		//System.out.println(ob);

	}

}
