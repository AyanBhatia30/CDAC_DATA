package com.demo.sorting;

import java.util.Arrays;
//create a array of strings to store student names
//and sort it using bubble sort, ask user whether to sort in ascending or descending order
//sort accordingly

//create Array of Employee objects(id,name,salary), and sort it based on salary
//ask user 1. ascending or 2. descending
public class BubbleSortDemo {
	public static void bubbleSortAscending(int[] arr) {
		
		    for(int i=0;i<arr.length;i++) {
		    	   int swapcount=0;
		    	for(int j=1;j<arr.length-i;j++) {
		    		if(arr[j-1]>arr[j]) {
		    			swapcount++;
		    			//swap the element
		    			int temp=arr[j];
		    			arr[j]=arr[j-1];
		    			arr[j-1]=temp;
		    		}
		    	
		    		
		    	}
		    	System.out.println("Iteration "+i+"Swap count "+swapcount);
		    	System.out.println(Arrays.toString(arr));
		    }
		
	}

	public static void improvedbubbleSort(int[] arr) {
		
	    for(int i=0;i<arr.length;i++) {
	    	   int swapcount=0;
	    	for(int j=1;j<arr.length-i;j++) {
	    		if(arr[j-1]>arr[j]) {
	    			swapcount++;
	    			//swap the element
	    			int temp=arr[j];
	    			arr[j]=arr[j-1];
	    			arr[j-1]=temp;
	    		}
	    	
	    		
	    	}
	    	System.out.println("Iteration "+i+"Swap count "+swapcount);
	    	System.out.println(Arrays.toString(arr));
	    	if(swapcount==0) {
	    		break;
	    	}
	    }
	
}
}
