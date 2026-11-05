package com.demo.sorting;

import java.util.Arrays;

public class CountSortWithString {

	public static void countSort(String[] arr) {
		// Find maximum string length
        int maxLength = 0;

        for (String str : arr) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        // Start from rightmost position character for sorting
        for (int position = maxLength - 1;position >= 0;   position--) {
            countingSort(arr, position);
        }
		
	}

	private static void countingSort(String[] arr, int position) {
		  // 0 = END of string
        // 1 = 'a'
        // 2 = 'b'
        // ...
        // 26 = 'z'  
		//create a count array
        int[] count = new int[27];
        // Step 1: Count characters
        for (String str : arr) {

            int index;

            if (position >= str.length()) {
                // String has ended
                index = 0;
            } else {
                index = str.charAt(position) - 'a' + 1;
            }

            count[index]++;
        }
        //find cummulative sum
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }
   
        String[] output = new String[arr.length];
        // Step 3: Build output array
        // Traverse from right to left to maintain stability
        for (int i = arr.length- 1; i >= 0; i--) {

            String str = arr[i];

            int index;

            if (position >= str.length()) {
                index = 0;
            } else {
                index = str.charAt(position) - 'a' + 1;
            }

            output[count[index] - 1] = str;
            count[index]--;
        }

        // Step 4: Copy output back
        for (int i = 0; i <arr.length; i++) {
            arr[i] = output[i];
        }
        System.out.println(Arrays.toString(arr));

		
	}
    
}
