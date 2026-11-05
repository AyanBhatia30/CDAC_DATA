package com.demo.test;

import java.util.Arrays;
import java.util.List;

public class TestStream {

	public static void main(String[] args) {
List<Integer> numbers = Arrays.asList(5, 10, 20, 10, 30, 40);
numbers.forEach(System.out::println);
		  // Stream ----- .stream()
System.out.println("Filter ");
		  numbers.stream()
          .filter(n -> n > 10).forEach(System.out::println);
System.out.println("Map ");		  
		  numbers.stream()
          .filter(n -> n > 10)
          .map(n -> n*2).
          distinct().
          sorted().toList();//
          
          // List 
	}

}




