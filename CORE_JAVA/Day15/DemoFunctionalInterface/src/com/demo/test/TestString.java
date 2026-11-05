package com.demo.test;

import java.util.Arrays;
import java.util.List;

import com.demo.util.Printable2;

public class TestString {

	public static void main(String[] args) {
		List<String> data 
		= Arrays.asList("Java", "Spring", "Boot");
		
		for(String s : data) {
			System.out.println(s);
		}
		
		System.out.println("\n\n");
		// ::   Java8
        data.forEach(System.out::println);
        
       

	}

}
