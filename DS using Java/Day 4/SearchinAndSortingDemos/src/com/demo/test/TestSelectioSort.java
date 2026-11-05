package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.SelectionSortDemo;

public class TestSelectioSort {

	public static void main(String[] args) {
		int[] arr= {10,5,4,20,255,66,44,5};
		//SelectionSortDemo.selectionSortAscending(arr);
        // SelectionSortDemo.selectionSortDescending(arr);
		System.out.println(Arrays.toString(arr));
         int maxnum=SelectionSortDemo.findNthMaximum(arr, 3);
         System.out.println("n th max is : "+maxnum);
	}

}
