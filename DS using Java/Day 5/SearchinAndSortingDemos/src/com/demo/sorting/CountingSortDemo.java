package com.demo.sorting;

import java.util.Arrays;

public class CountingSortDemo {
        public static int[] countingSort(int[] arr) {
        	//find max
        	int max=findMax(arr);
        	//create a array with size max+1
        	int[] countarr=new int[max+1];
        	//initialize the array to 0
        	Arrays.fill(countarr, 0);
          //find number of occurrences of each number in th earray
        	for(int i=0;i<arr.length;i++) {
        		int idx=arr[i];
        		countarr[idx]++;
        		//countarr[arr[i]]++
        	}
        	System.out.println("Array :"+Arrays.toString(arr));
        	System.out.println("Count array :");
        	System.out.println(Arrays.toString(countarr));
        	//find cummulative sum 
        	for(int i=1;i<countarr.length;i++) {
        		countarr[i]=countarr[i]+countarr[i-1];
        	}
        	System.out.println("cummulative sum array");
        	System.out.println(Arrays.toString(countarr));
        	int[] output=new int[arr.length];
        	for(int i=0;i<arr.length;i++) {
        		int val=arr[i];
        		int pos=countarr[val]-1;
        		countarr[val]--;
        		output[pos]=val;
        	}
        	return output;
        }

		private static int findMax(int[] arr) {
			int max=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(max<arr[i])
					max=arr[i];
			}
			return max;
		}
}
