package com.demo.sorting;

import java.util.Arrays;

public class SelectionSortDemo {
          public static void selectionSortAscending(int[] arr) {
        	  //find next minimum and swap it at the begining of unsorted array
        	  for(int i=0;i<arr.length;i++) {
        		  int minidx=findMin(arr,i);
        		  System.out.println("new minimum is at  "+minidx+ "  position ");
        		  //swap minindex with i
        		  int temp=arr[i];
        		  arr[i]=arr[minidx];
        		arr[minidx]=temp;		
        		System.out.println(Arrays.toString(arr));
        		System.out.println(i+" iteration"+"minidx: "+minidx);
        	  }
          }

          public static void selectionSortDescending(int[] arr) {
        	  //find next minimum and swap it at the begining of unsorted array
        	  for(int i=0;i<arr.length;i++) {
        		  int maxidx=findMax(arr,i);
        		  System.out.println("new maximum is at  "+maxidx+ "  position ");
        		  //swap maxidx with i
        		  int temp=arr[i];
        		  arr[i]=arr[maxidx];
        		arr[maxidx]=temp;		
        		System.out.println(Arrays.toString(arr));
        		System.out.println(i+" iteration"+"minidx: "+maxidx);
        	  }
          }
          
          public static int findNthMaximum(int[] arr,int num) {
        	  
        	  for(int i=0;i<num;i++) {
        		  int maxidx=findMax(arr,i);
        		  //swap maxid with i th position valie
        		  int temp=arr[i];
        		  arr[i]=arr[maxidx];
        		  arr[maxidx]=temp;
        	  }
        	  return arr[num-1];
          }
          
          
		  private static int findMax(int[] arr, int start) {
			int maxid=start;
			for(int i=start+1;i<arr.length;i++) {
				if(arr[maxid]<arr[i]) {
					maxid=i;
				}
			}
			return maxid;
		}

		  private static int findMin(int[] arr, int start) {
			  int minidx=start;
			  
			for(int i=start+1;i<arr.length;i++) {
				if (arr[minidx]>arr[i]) {
					minidx=i;
					
				}
			}
			return minidx;
		  }
}
