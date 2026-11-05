package com.demo.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.demo.model.Student;

public class TestStudentMap {

	public static void main(String[] args) {
		Student s1 = new Student(101, "ABC", 56);
		Student s2 = new Student(102, "AC", 76);
		Student s3 = new Student(103, "AB", 86);
		Student s4 = new Student(101, "XYZ", 56);
		
		
		Map<Integer, Student>  mapStudent ;		
		mapStudent = new TreeMap<Integer, Student>();
		
		mapStudent.put(s1.getId(), s1);
		mapStudent.put(s2.getId(), s2);
		mapStudent.put(s3.getId(), s3);
		mapStudent.put(s4.getId(), s4);
		
		System.out.println(mapStudent);
		// search by id 
		int id = 101 ;
		System.out.println(mapStudent.containsKey(id));
		
		System.out.println(mapStudent.get(id));
		
		
		int marks = 65;
		// search by marks 
		// iterate map -  Student Object -  marks -- 
		// set of Entry  key value 
		Set<Entry<Integer , Student> > se 
		=  mapStudent.entrySet();
		
		for(Entry<Integer , Student> r : se) {
			if(r.getValue().getMarks() == marks)
			{
				System.out.println(r.getValue());
			} else {
				System.out.println("Not Found ");
			}
		}
	}

}




