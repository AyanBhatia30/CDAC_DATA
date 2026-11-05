package com.demo.test;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSearch {

	public static void main(String[] args) {
		// int i = new int [12 , 23 , 34 ,45 , 11 , 24 , 45 ,56];
		
		NavigableSet<Integer> ni = new TreeSet<>();
		
		ni.add(12);
		ni.add(23);
		ni.add(13);
		ni.add(63);
		ni.add(132);
		ni.add(263);
		ni.add(2);
		ni.add(3);
		ni.add(120);
		ni.add(239);
		
		System.out.println(ni);		
		System.out.println(ni.contains(45));		
		System.out.println(ni.floor(45));		
		System.out.println(ni.ceiling(45));		
		System.out.println(ni.last());		
		System.out.println(ni.headSet(23));		
		System.out.println(ni.tailSet(45));
		
		
		

	}

}
