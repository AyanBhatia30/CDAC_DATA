package com.demo.test;

import java.util.Arrays;

import com.demo.searching.SearchingDemos;

public class TestSearching {
         public static void main(String[] args) {
        	 int[] arr= {5,7,8,15,20,35,63,75,80,85,87};
        	/* System.out.println("Pos 80   "+SearchingDemos.binarySearchNonRecurssive(arr, 80));
        	 System.out.println("Pos 63"+SearchingDemos.binarySearchNonRecurssive(arr, 63));
        	 System.out.println("Pos "+SearchingDemos.binarySearchNonRecurssive(arr, 100));*/
        	 
        	 System.out.println(Arrays.toString(arr));
        	 System.out.println("Pos 80 --->  "+SearchingDemos.binarySearchRecurssive(arr, 80,0,arr.length-1));
        	 System.out.println("Pos 63--->"+SearchingDemos.binarySearchRecurssive(arr, 63,0,arr.length-1));
        	 System.out.println("Pos 100 -->"+SearchingDemos.binarySearchRecurssive(arr, 100,0,arr.length-1));
        	 System.out.println("Pos 7--->  "+SearchingDemos.binarySearchRecurssive(arr, 7,0,arr.length-1));
        	 System.out.println("Pos 3---->"+SearchingDemos.binarySearchRecurssive(arr, 3,0,arr.length-1));
        	 System.out.println("Pos 20---->"+SearchingDemos.binarySearchRecurssive(arr, 20,0,arr.length-1));
         }
}
