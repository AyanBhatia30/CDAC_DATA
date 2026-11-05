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
    		 
    	 }else {
    		 //add for rotate left
    	 }
     }
     
     //flag=true rotate up
     //flag=false rotate down
     
    public void rowrotate(boolean flag,int num) {
    	if(flag) {
    		for(int cnt=0;cnt<num;cnt++) {
			    		int[] temp=arr[0];
			    		for(int i=0;i<arr.length-1;i++) {
			    			arr[i]=arr[i+1];
			    		}
			    		arr[arr.length-1]=temp;
    		}
    	}else {
    		
    		//add for rotate down
    	}
    }
    
    //find transpose of array
    public int[][] transpose(){
    	//if matrix is 2X3 the resultant matrix should be 3X2
    	int[][] arr1=new int[arr[0].length][arr.length];
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr[0].length;j++) {
    			arr1[j][i]=arr[i][j];
    		}
    	}
    	return arr1;
    }
    //check whether it is identity matrix
       public boolean isIdentity() {
    		for(int i=0;i<arr.length;i++) {
        		for(int j=0;j<arr[0].length;j++) {
        		     if((i!=j && arr[i][j]==0) || ((i==j) && (arr[i][j]==1)) ){
        		    	    continue;
        		    	 
        		     }else {
        		    	 return false;
        		     }	
        		     
        		}
        		}
    		   return true;
       }
    //find addition of all values
       public int findSum() {
    	   int sum=0;
    	   for(int i=0;i<arr.length;i++) {
    		   for(int j=0;j<arr[0].length;j++) {
    			   sum+=arr[i][j];
    		   }
    	   }
    	   return sum;
       }
    //find addition of digits of all numbers
       public int[][] findDigitSumAll(){
    	   int[][] arr1=new int[arr.length][arr[0].length];
    	   for(int i=0;i<arr.length;i++) {               
    		   for(int j=0;j<arr[0].length;j++) {     
    			   arr1[i][j]=findDigitSum(arr[i][j]);
    		   }
    	   }
    	   return arr1;
       }
       
   //find columnwisemax
       public int[] findColumnwiseMax() {
    	   int[] maxnum=new int[arr[0].length];
    	   //column loop
    	   for(int j=0;j<arr[0].length;j++) {
    		    maxnum[j]=arr[0][j];   //max is initialized to 0th row jth column 
    		    //row loop
    		   for(int i=0;i<arr.length;i++) {
    			        if(maxnum[j]<arr[i][j]) {
    			        	maxnum[j]=arr[i][j];
    			        }
    		   }
    	   }
    		  return maxnum;
       }
    //find rowwisemax
       public int[] findRowwiseMax() {
    	   int[] maxnum=new int[arr.length];
    	  
    	   //row loop
    	   for(int i=0;i<arr.length;i++) {
    		   maxnum[i]=arr[i][0];   //max is initialized to 0th row jth column 
    		   //column loop
    	   for(int j=0;j<arr[0].length;j++) {  
    			        if(maxnum[i]<arr[i][j]) {
    			        	maxnum[i]=arr[i][j];
    			        }
    		   }
    	   }
    		  return maxnum;
       }
    //find columnwise min
       public int[] findColumnwiseMin() {
    	   int[] minnum=new int[arr[0].length];
    	   //column loop
    	   for(int j=0;j<arr[0].length;j++) {
    		    minnum[j]=arr[0][j];   //max is initialized to 0th row jth column 
    		    //row loop
    		   for(int i=0;i<arr.length;i++) {
    			        if(minnum[j]>arr[i][j]) {
    			        	minnum[j]=arr[i][j];
    			        }
    		   }
    	   }
    		  return minnum;
       }
    //find rowise min
       public int[] findRowwiseMin() {
    	   int[] minnum=new int[arr.length];
    	  
    	   //row loop
    	   for(int i=0;i<arr.length;i++) {
    		   minnum[i]=arr[i][0];   //max is initialized to 0th row jth column 
    		   //column loop
    	   for(int j=0;j<arr[0].length;j++) {  
    			        if(minnum[i]>arr[i][j]) {
    			        	minnum[i]=arr[i][j];
    			        }
    		   }
    	   }
    		  return minnum;
       }
	private int findDigitSum(int num) {
		int sum=0;
		while(num!=0) {   
			int d=num%10;
			sum+=d;
			num=num/10;
		}
		return sum;
	}
    
     
}
