package com.demo.sorting;

import java.util.Arrays;

public class InsertionSortDemo {
	
	public static void insertionSortAscending(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			//i is starting of unsorted part of array
			int j=i-1;
			//j is end of sorted part of array
			int key=arr[i];
			int shiftcount=0;
			while(j>=0 && arr[j]>key) {
				//shift elements to right
				arr[j+1]=arr[j];
				shiftcount++;
				j--;
			}
			//place key at j+1 position
			arr[j+1]=key;
			System.out.println("Shift count : "+shiftcount);
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
	public static void insertionSortDescending(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			//i is starting of unsorted part of array
			int j=i-1;
			//j is end of sorted part of array
			int key=arr[i];
			while(j>=0 && arr[j]<key) {
				//shift elements to right
				arr[j+1]=arr[j];
				j--;
			}
			//place key at j+1 position
			arr[j+1]=key;
			
		}
		
	}


}
