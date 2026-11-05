package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.HeapSortDemo;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr= {10,3,76,34,23,32,20};
		HeapSortDemo.heapSortAscending(arr);
		System.out.println(Arrays.toString(arr));

	}

}
