package com.demo.arrays;

import java.util.Arrays;

public class MyArray {
	private int[] arr;
	private int count;
	public MyArray() {
		arr=new int[10];
		count=0;
	}
	public MyArray(int size) {
		arr=new int[size];
		count=0;
	}
	
	public MyArray(int[] arr1,int cnt) {
		arr=arr1;
		count=cnt;
	}
	  //add after last number 
	public boolean add(int n) {
		if(count<arr.length) {
		  arr[count]=n;
		  count++;
		  return true;
		}
		return false;
	}
	
	//add n at given position
    public boolean add(int n,int pos) {
    	 //check whether position is within limit
		 if((count<arr.length)&& (pos<count)) {
		 //shift values one location to right from count to position 
		 //add the number at the pos
		 for(int i=count;i>pos;i--) {
			 arr[i]=arr[i-1];
		 }
		 //add x at the position
		 arr[pos]=n;
		 count++;
		 return true;
		 }else {
			 return false;
		 }
			
		
		
	}
    
    //search by value
    public int search(int num) {
    	for(int i=0;i<count;i++) {
    		if(arr[i]==num) {
    			return i;
    		}	
    	}
    	return -1;
    }
    //delete from given position
    public boolean deleteByPosition(int pos) {
    	//if pos is the last element in the array
    	if(pos==arr.length-1) {
    		arr[pos]=0;
    		count--;
    		return true;
    	}else {
    		//check whether given pos is in limit
    		if(pos<count) {
    			for(int i=pos;i<count;i++) {
    				arr[i]=arr[i+1];
    			}
    			count--;
    			return true;
    			
    		}
    		//given position is out of bounds
    		return false;
    	}
    	
    }
    
    //delete the given value
	
	
	public int findMax() {
		int max=this.arr[0];
		for(int i=1;i<count;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		return max;
	}
	
	public int findSum() {
		int sum=0;
		for(int i=0;i<count;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	@Override
	public String toString() {
		return "MyArray [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
	}
	

}
