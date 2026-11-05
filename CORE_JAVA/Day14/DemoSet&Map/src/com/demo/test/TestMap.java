package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		Map<Integer, Integer>  sResult ;		
		sResult = new HashMap<Integer, Integer>();
		//adding data inside map <Key  Value> 
		sResult.put(101, 48);
		
		sResult.put(103, 89);
		sResult.put(104, 78);
		sResult.put(102, 49);
		// Retrival 
		//sResult.get(<"Key">)  ---- value 
		System.out.println(" Data / Value " + sResult.get(102));
		// Print Whole MAP 100 
		System.out.println(sResult);
		
		sResult.put(103, 75);
		
		System.out.println(sResult);
		
		// iterate  --- Map  --- Key - Value 
		//for get<key>
		// keys 
		// set of Keys from Map 
		Set<Integer> sKey = sResult.keySet();
		for(Integer k : sKey) {
			System.out.println(k + " : " + sResult.get(k));
		}
		// key-value   Entry getKey   getValue 
Set<Entry<Integer, Integer>> sData = sResult.entrySet();
	
	for(Entry e : sData) {
		System.out.println("whole entry : "  + e);
		
		System.out.println(e.getKey() + "  " + e.getValue());
	}
		
		
		
		
		
		
		

	}

}







