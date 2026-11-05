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
		 //add n at the position
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
    			//return position if found
    			return i;
    		}	
    	}
    	//if not found
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
    			//deletion is successful
    			return true;
    			
    		}
    		//given position is out of bounds
    		return false;
    	}
    	
    }
    
    //delete the given value
	public int deleteByValue(int val) {
		int pos=search(val);
		if(pos!=-1) {
			boolean status=deleteByPosition(pos);
			if(status) {
				//value found and deleted from the given position
				return pos;
			}
			
		}
		//value not found
		return -1;
		
	}
	
	//reverse the array
	public void reverseArray() {
		for(int i=0,j=count-1;i<j;i++,j--) {
			//swap ith and jth number
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;	
		}
	}
	//assumption --->all values are +ve
	public int[] exchangeIndexValue() {
		int max=findMax();
		int[] arr1=new int[max+1]; //create a new array
		Arrays.fill(arr1, -1); //initialize all values with -1
		//exchange index with values in arr1
		for(int i=0;i<count;i++) {
			int index=arr[i];
			int value=i;
			arr1[index]=value;
			//arr1[arr[i]]=i;
		}
		return arr1;
	}
	
	//if flag is true the find sum of all odd numbers
	//if flag is false then find sum of all even numbers
	public int addAllodd_Even_num(boolean flag) {
		int sum=0;
		if(flag) {
			//add all odd numbers
			for(int i=0;i<count;i++) {
				if(arr[i]%2!=0)
					sum+=arr[i];
			}
		}else {
			//add all even numbers
			for(int i=0;i<count;i++) {
				if(arr[i]%2==0)
					sum+=arr[i];
			}
		}
		return sum;	
	}
	public boolean isPrime(int num) {
		for(int i=2;i<num/2;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	public int findMaximumPrimeNumber() {
		//finding 1 st prime number in the array and assign it max
		   int i,max=-1;
		   for( i=0;i<count;i++) {
			   if(isPrime(arr[i])) {
				   max=arr[i];
				   break;
			   }
		   }
		  for(int j=i+1;j<count;j++) {
			  if(isPrime(arr[j]) && max<arr[j]) {
				  max=arr[j];
			  }
		  } 
		  return max; 
		   
	}
	
	//if flag is true then rotate right --->num times
	//if flag is false then rotate left---->num times
	public void rotatateArray(boolean flag,int num) {
		if(flag) {//right rotation
			for(int j=0;j<num;j++) {
				int temp=arr[count-1];
				for(int i=count-1;i>0;i--) {
					arr[i]=arr[i-1];
				}
				arr[0]=temp;
			}
			
		}else { //left rotation
			for(int j=0;j<num;j++) {
				int temp=arr[0];
				for(int i=0;i<count-1;i++) {
					arr[i]=arr[i+1];
					
				}
				arr[count-1]=temp;
			}
	
		}
		
	}
	
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
