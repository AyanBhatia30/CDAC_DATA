package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.demo.model.City;

public class TestCity {
	
	private static List<City> prepareTemperature() {
	    List<City> cities = new ArrayList<>();
	    cities.add(new City("New Delhi", 33.5));
	    cities.add(new City("Mexico", 14));
	    cities.add(new City("New York", 13));
	    cities.add(new City("Dubai", 43));
	    cities.add(new City("London", 15));
	    cities.add(new City("Alaska", 1));
	    cities.add(new City("Kolkata", 30));
	    cities.add(new City("Sydney", 11));
	    cities.add(new City("Mexico", 14));  // duplicate
	    cities.add(new City("Dubai", 43));   // duplicate
	    return cities;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List 
		System.out.println(prepareTemperature());	
		System.out.println("\n\n");
		prepareTemperature().forEach(System.out::println);
		System.out.println("\n\n");
			
		prepareTemperature().stream()
		.filter(f->f.getTemperature() >10).limit(5).forEach(System.out::println);
			
		prepareTemperature().stream()
		.filter(f->f.getTemperature() >10).skip(2).forEach(System.out::println);
			
	List newList = 
			prepareTemperature().stream()
			.filter(f->f.getTemperature() >10).toList();
			//.forEach(System.out::println);
	
	System.out.println(newList);
	
	//stream()   ---- Set 
	//stream()   List 
	//MAP  --- key value 
Set newSet = 
		prepareTemperature().stream()
		.filter(f->f.getTemperature() >10)
		.collect(Collectors.toSet());

//Collectors.toMap(name , temp)

	
	
	
	
	
	 System.out.println(prepareTemperature()
             .stream()
             .filter(city -> city.getTemperature() > 10)
             .collect(Collectors.toMap(
                         City::getName,
                         City::getTemperature,
                         (key, identicalKey) -> key)));	

	 
	 
	 
	 System.out.println(prepareTemperature()
             .stream()
             .collect(Collectors.groupingBy(
                         City::getName,
                         Collectors.counting())));
	 
	 System.out.println(prepareTemperature()
             .stream()
             .collect(Collectors.counting()));
}
}




