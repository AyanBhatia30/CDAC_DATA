package com.demo.test;

import com.demo.sorting.QuickSortDemo;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] arr= {23,4,7,8,21,8,6,2,5};
		QuickSortDemo.quickSort(arr, 0, arr.length-1);

	}

}
