package com.demo.sorting;

import java.util.Arrays;

public class HeapSortDemo {
	   public static void heapify(int[] arr,int n,int i) {
		   int left=2*i+1;
		   int right=2*i+2;
		   int largest=i;
		   //check where left child exists and is it > than parent
		   if(left<n && arr[left]>arr[largest] ) {
			   largest=left;
		   }
		   if(right<n && arr[right]>arr[largest] ) {
			   largest=right;
		   }
		   if(largest!=i) {
			   //swap i th element and largest
			   int temp=arr[largest];
			   arr[largest]=arr[i];
			   arr[i]=temp;
			   //reheapify the following tree
			   heapify(arr,n,largest);
		   }
		   System.out.println(Arrays.toString(arr));
			System.out.println("--------------------------------------------");
	   }
	
	    public static void heapSortAscending(int[] arr) {
	    	//convert the tree into max heap
	    	for(int i=(arr.length/2)-1;i>=0;i--) {
	    		  heapify(arr,arr.length,i);
	    	}
	    	int n=arr.length;
	    	for(int i=n-1;i>=0;i--) {
	    		//swap topmost element with the last value in the array
	    		int temp=arr[i];
	    		arr[i]=arr[0];
	    		arr[0]=temp;
	    		//reconvert the tree into max heap by using heapify function
	    		heapify(arr,i,0);
	    	}
	    }

}
