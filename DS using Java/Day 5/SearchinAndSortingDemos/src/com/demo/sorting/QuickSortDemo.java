package com.demo.sorting;

import java.util.Arrays;

public class QuickSortDemo {
	
	public static void quickSort(int[] arr,int start,int end) {
		 
		if(start<end) {
			// it places pivot element at proper place, and returns pivot position
				 int p=partition(arr,start,end);   
				 //recurssive call for left array
				 quickSort(arr,start,p-1);
				 //recurssive call for right array
				 quickSort(arr,p+1,end);
		}
	}
	
	public static int partition(int[] arr,int start,int end) {
		int pivot=start;
		int i=start;
		int j=end;
		
		while(i<j) {
		while((i<end) &&(arr[i]<=arr[pivot])){
			i++;
		}
		while((j>start) &&(arr[j]>arr[pivot])){
			j--;
		}
		if(i<j) {
			//swap i th and j th element
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}else {
			//swap pivot with arr[j]
			if(j!=pivot) {
			int temp=arr[pivot];
			arr[pivot]=arr[j];
			arr[j]=temp;
			}
		}     
	} 
		   System.out.println(Arrays.toString(arr));
		   System.out.println("Pivot position  : "+j+"  pivot number :  "+arr[j]);
		   System.out.println(arr[j]+"pivot number is swapped with  "+arr[pivot]);
		   System.out.println("-------------------------------------------------");
		//pivot position
		   return j;  
	}

}
