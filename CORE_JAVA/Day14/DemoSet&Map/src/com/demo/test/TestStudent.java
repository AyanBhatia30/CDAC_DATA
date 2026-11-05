package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import com.demo.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		Set<Student> s = new HashSet<Student>();
		//  equals   --- hashCode
		Student s1 = new Student(101, "ABC", 56);
		Student s2 = new Student(102, "AC", 76);
		Student s3 = new Student(103, "AB", 86);
		Student s4 = new Student(101, "XYZ", 56);
		
		s4 = new Student(103, "XYZ", 56);
		//  id ---- 
		System.out.println("adding data in set ");
		// hashcode 
		s.add(s1);
		s.add(s2);//s1.equals(s2)
		s.add(s1);// equals ///  
		s.add(s4);// new Object 
		System.out.println("Set Data ");
		for(Student temp : s) {
			System.out.println(temp);
		}

	}

}






