package com.demo.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		
		Set<Integer>  si ;		
		si = new HashSet<Integer>();		
		si.add(152);
		si.add(1);
		si.add(12);
		si.add(352);		
		System.out.println(si);		
		si.add(152);		
		System.out.println(si);
		
		Set<Integer> snew = new TreeSet<>();
		// HashSet si 
		snew.addAll(si);
		
		System.out.println(snew);
		
		for(Integer i : snew) {
			System.out.println(i);
		}
		
		Iterator<Integer>  it = snew.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
