package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.BubbleSortDemo;

public class TestBubleSort {

	public static void main(String[] args) {
		int[] arr= {5,2,3,7,10,12,1};
		BubbleSortDemo.bubbleSortAscending(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr1= {1,10,12,5,7,11,8,9};
		BubbleSortDemo.improvedbubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}

}
