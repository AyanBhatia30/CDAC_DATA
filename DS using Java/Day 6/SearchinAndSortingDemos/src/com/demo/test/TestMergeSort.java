package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.MergeSortDemo;

public class TestMergeSort {

	public static void main(String[] args) {
	     int[] arr= {2,13,15,20,25,30,3,4,7,12,15};
	     MergeSortDemo.mergesort(arr, 0, arr.length-1);
	     System.out.println(Arrays.toString(arr));

	}

}
