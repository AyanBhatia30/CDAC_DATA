package com.demo.searching;
//Write a program to store array of strings, 
// accept search string from user, and search it using sequential search or binary search

public class SearchingDemos {
   public static int sequentialSearch(int[] arr,int num) {
	     for(int i=0;i<arr.length;i++) {
	    	 if(arr[i]==num) {
	    		 return i;    //found so return position
	    	 }
	     }
	     return -1;   //not found
   }
   
   public static int binarySearchNonRecurssive(int[] arr,int n) {
	   int low=0;
	   int high=arr.length-1;
	   int cnt=0;
	   while(low<=high) {
			   int mid=(low+high)/2;
			   System.out.println("low : "+low+" high: "+high+" mid"+mid);
			   cnt++;
			   if(arr[mid]==n) {	
				   System.out.println("Number of comparisons are : "+cnt);
				   return mid;
			   }
			   //checking second half
			   if(arr[mid]<n) {
				   low=mid+1;
			   }else {//checking 1 st half
				   high=mid-1;
			   }
			   
	   }
	   return -1;
   }
   
   public static int binarySearchRecurssive(int[] arr,int num,int low,int high) {
	        if(low<=high) {
	        	int mid=(low+high)/2;
	        	if(arr[mid]==num) {
	        		return mid;
	        	}
	        	
	        	if(arr[mid]<num) {
	        		return binarySearchRecurssive(arr,num,mid+1,high);
	        	}else {
	        		return binarySearchRecurssive(arr,num,low,mid-1);
	        	}
	        }
	        return -1;
   }
}
