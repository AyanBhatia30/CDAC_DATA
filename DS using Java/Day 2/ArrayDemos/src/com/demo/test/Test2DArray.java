package com.demo.test;

import com.demo.arrays.My2DArray;

public class Test2DArray {

	public static void main(String[] args) {
	     My2DArray ob=new My2DArray();
	     ob.acceptData();
	     ob.displayData();
	     //My2DArray ob1=new My2DArray();
	     //ob1.acceptData();
	     //ob1.displayData();
	   //  int [][] ans=ob.add2Arrays(ob1);
	  //  int ans[][]=ob.multiply2Arrays(ob1);
	   /*  if(ans!=null) {
		    	displayArr(ans); 
		     }else {
		    	 System.out.println("dimenssions are not matching");
		     }*/
	     
	     /*   int[] result=ob.findRowiseSum() ;   
	        for(int i=0;i<result.length;i++) {
	        	System.out.print(result[i]);
	        }
	        System.out.println("----------------------");
	    result=ob.findcolumnwiseSum() ;   
	        for(int i=0;i<result.length;i++) {
	        	System.out.print(result[i]);
	        }*/
	     
	     //column rotation
         	 ob.columnRotate(true, 2);
         	 ob.displayData();
	}

	private static void displayArr(int[][] ans) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
