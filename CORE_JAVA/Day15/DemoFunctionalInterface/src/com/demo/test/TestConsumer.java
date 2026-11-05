package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestConsumer {

	public static void main(String[] args) {
		//  consume void 
		//Declaration 
		Consumer<Integer> ci = (i)->System.out.println(i*15);
		//System.out.println(ci.accept(15));		
		ci.accept(15);
		// return 
		//Consumer<Integer> ci1 = (i)->(i*15);
		
		// suplier 
		//List<Integer> l = new ArrayList<>();
		//Supplier sList ;//= (d)-> return d ;
		//sList.get();

	}

}





