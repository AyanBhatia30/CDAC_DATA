package com.demo.sorting;

import java.util.Arrays;

public class MergeSortDemo {
	public static void mergesort(int[] arr,int start, int end) {
		if(start<end) {
			//calculate mid position
			int mid=(start+end)/2;
			//left tree sorting
			mergesort(arr,start,mid);
			//right tree sorting
			mergesort(arr,mid+1,end);
			merge(arr,start,mid,end);      //start,mid       mid+1,end
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		//find length of 1 st array in n1, and length of 2 nd array and store in n2
		int n1=mid-start+1;
		int n2=end-mid;
		int[] leftarr=new int[n1];
		int[] rightarr=new int[n2];
		for(int i=0;i<n1;i++) {
			leftarr[i]=arr[start+i];
		}
		for(int i=0;i<n2;i++) {
			rightarr[i]=arr[mid+1+i];
		 }
		//merge leftarr and rightarr
		int i=0,j=0,k=start;
		while(i<n1 && j<n2) {
			if(leftarr[i]<rightarr[j]) {
				arr[k]=leftarr[i];
				k++;i++;
			}else {
				arr[k]=rightarr[j];
				k++;
				j++;
			}
		}
		//copy remaining elements of leftarry
		while(i<n1) {
			arr[k]=leftarr[i];
			k++;i++;
		}
		
		while(j<n2) {
			arr[k]=rightarr[j];
			k++;j++;
		}
		System.out.println(start+"----"+mid+"------"+end);
		System.out.println(Arrays.toString(leftarr));
		System.out.println(Arrays.toString(rightarr));
		System.out.println("-----------------------------");
	}

}
