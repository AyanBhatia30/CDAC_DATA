package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.CountingSortDemo;

public class TestCountSort {

	public static void main(String[] args) {
		int[] arr= {3,2,4,5,1,4,7,4,7,8,2};
		int[] sarr=CountingSortDemo.countingSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sarr));

	}

}
