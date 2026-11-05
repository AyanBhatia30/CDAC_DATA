package com.demo.test;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestPredict {
	
	public float getData(int i ) {
		
		return  i*10.0f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// return  boolean data 
		Predicate<Integer> p = (i) -> i>10;		
		System.out.println(p.test(12));	
		System.out.println(p.test(1));
		p.negate();// false 
		
		Predicate<Integer> peven = (i) -> i%2 == 0;		
		System.out.println(peven.and(p).test(15));// and 
		System.out.println(peven.or(p).test(15));  // or 
		System.out.println(peven.or(p).negate().test(15));  // 
		
		//  input data format , output data format 
		Function<Integer, Float> f = (num) -> num *10.0f ;		
		System.out.println(f.apply(15));		
		Function<Float, Float> f1 = (num) -> num *12.0f ;		
		System.out.println(f.andThen(f1).apply(14));

	}

}





