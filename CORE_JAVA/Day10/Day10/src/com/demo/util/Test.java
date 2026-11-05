package com.demo.util;

public class Test {
public static double getDoubleUsingIf(Object o) {
    double result;
    if (o instanceof Integer) {
        result = ((Integer) o).doubleValue();
    } else if (o instanceof Float) {
        result = ((Float) o).doubleValue();
    } else if (o instanceof String) {
        result = Double.parseDouble(((String) o));
    } else {
        result = 0d;
    }
    return result;
}



//  java 5 , java 8  , java 11

/*
 * public static double getDouble(Object o ){ return switch(o){ case Integer i
 * -> i.doubleValue(); case String s -> Double.parseDouble(s); default -> 0d;
 * 
 * 
 * };
 */



public static void main(String[] a){
	System.out.println(getDoubleUsingIf(12.45f));

	//System.out.println(getDouble(12));

}
}