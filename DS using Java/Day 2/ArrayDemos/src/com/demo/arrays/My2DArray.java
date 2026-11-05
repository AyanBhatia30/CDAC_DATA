package com.demo.arrays;

import java.util.Scanner;

public class My2DArray {

	 private int[][] arr;
	 public My2DArray() {
		 arr=new int[3][3];
	 }
     public My2DArray(int rows,int cols) {
		
		this.arr = new int[rows][cols];
	}
     //accept data from keyboard and store it in array
     public void acceptData() {
    	 Scanner sc=new Scanner(System.in);
    	 for(int i=0;i<arr.length;i++) {
    		 for(int j =0; j<arr[0].length;j++) {
    			 System.out.println("enter number row "+i+" and column " +j);
    			 arr[i][j]=sc.nextInt();
    		 }
    	 }
    	 
     }
     
     //display data
     
     public void displayData() {
    	   for(int i=0;i<arr.length;i++) {
    		   for(int j=0;j<arr[0].length;j++) {
    			   System.out.print(arr[i][j]+"\t");
    		   }
    		   System.out.println();
    	   }
     }
     
     public int[][] add2Arrays(My2DArray ob){
    	 if((arr.length==ob.arr.length)&& (arr[0].length==ob.arr[0].length)) {
    		 int[][] result=new int[arr.length][arr[0].length];
    		 for(int i=0;i<arr.length;i++) {
    			 for(int j=0;j<arr[0].length;j++) {
    				    result[i][j]=arr[i][j]+ob.arr[i][j];
    			 }
    		 }
    		 return result;
    	 }
    	 return null;
     }
     
     public int[][] subtract2Arrays(My2DArray ob){
         return null;	 
     }
     
     public int[][] multiply2Arrays(My2DArray ob){
    	 //check whether column of 1st array matches with rows of 2nd matrix
    	 if(arr[0].length!=ob.arr.length) {
    		 return null;
    	 }
    	 //size of result is rows of 1 st object and columns of 2nd object
    	 int[][] result=new int[arr.length][ob.arr[0].length];
    	 for(int i=0;i<arr.length;i++) {      ///row number of result
    		 for(int j=0;j<ob.arr[0].length;j++) {   //cols of result
    			 for(int k=0;k<ob.arr.length;k++) {
    				 result[i][j]+=arr[i][k]*ob.arr[k][j];
    			 }
    			 
    		 }
    	 }
    	 return result;
     }
     
     //find rowwise sum
     public int[] findRowiseSum() {
    	 int[] sumrows=new int[arr.length];
    	 for(int i=0;i<arr.length;i++) {
    		 int sum=0;
    		 for(int j=0;j<arr[0].length;j++) {
    			 sum+=arr[i][j];
    		 }
    		 sumrows[i]=sum;
    	 }
    	 return sumrows;
     }
        
     public int[] findcolumnwiseSum() {
    	 int[] sumcols=new int[arr[0].length];
    	 for(int i=0;i<arr[0].length;i++) {
    		 int sum=0;
    		 for(int j=0;j<arr.length;j++) {
    			 sum+=arr[j][i];
    		 }
    		 sumcols[i]=sum;
    	 }
    	 return sumcols;
     }
     
     //flag=true   then rotate right
     //flag=false  then rotate left
     public void columnRotate(boolean flag, int num) {
    	 if(flag) {
    		 for(int cnt=0;cnt<num;cnt++) {
    			 //create a temp array and 
    			 int[] temp=new int[arr.length];
    			 //copy last column into temp array
    			 for(int i=0;i<arr.length;i++) {
    				 temp[i]=arr[i][arr[0].length-1];
    			 }
    			 //shift all remaining columns to right 
    			 for(int i=arr[0].length-2;i>=0;i--) {
    				 for(int j=0;j<arr.length;j++) {
    					 arr[j][i+1]=arr[j][i];
    				 }
    			 }
    			 //copy temp array to 0 th column of array
    			 for(int i=0;i<temp.length;i++) {
    				 arr[i][0]=temp[i];
    			 }
    			 
    			 
    		 }
    		 
    	 }
     }
     

     
}
