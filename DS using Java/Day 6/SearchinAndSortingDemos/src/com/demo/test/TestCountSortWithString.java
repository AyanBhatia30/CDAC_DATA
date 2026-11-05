package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.CountSortWithString;

public class TestCountSortWithString {

	public static void main(String[] args) {
		String[] arr = {
	            "cat",
	            "apple",
	            "bat",
	            "car",
	            "app",
	            "ball",
	            "a",
	            "banana"
	        };

	        System.out.println("Before sorting:");
	        System.out.println(Arrays.toString(arr));

	        CountSortWithString.countSort(arr);

	        System.out.println("\nAfter sorting:");
	        System.out.println(Arrays.toString(arr));
	}

}
