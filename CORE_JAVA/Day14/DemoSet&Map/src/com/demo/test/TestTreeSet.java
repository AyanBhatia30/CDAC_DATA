package com.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.demo.model.Student;

public class TestTreeSet {
	
	public static void main(String[] args) {
		Set<Student> s = new TreeSet<Student>();
		//  Sort   Comparable
		Student s1 = new Student(101, "ABC", 56);
		Student s2 = new Student(102, "AC", 76);
		Student s3 = new Student(103, "AB", 86);
		Student s4 = new Student(101, "XYZ", 56);
		//  id ---- 
		System.out.println("adding data in set ");
		// hashcode 
		s.add(s1);
		s.add(s3);
		s.add(s2);//s1.equals(s2)
		s.add(s1);// equals ///  
		s.add(s4);// new Object 
		System.out.println("Set Data ");
		for(Student temp : s) {
			System.out.println(temp);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id of Student for deletion ");
		int id = sc.nextInt();
		
		boolean ans = s.remove(new Student(id));//Object Student
		
		if(ans) {			
			System.out.println("Student Removed ");
		} else {			
			System.out.println("Student not Found");
		}
		
		// true 
		boolean a  = s.contains(new Student(id));
		
		// search 
		for(Student temp : s) {
			if(temp.getId() == id)
			{
				System.out.println(temp);
			}
		}
		
		
		// sort Marks Comparator 
		
		// new class imp  Comparator
		
		//List ----- Set 
		// Comparator compare LinkedHashSet 
		//HashSet   array  LinkedHashSet
		List<Student> lStudnet = new ArrayList<>(s);
		//lStudent.sort(<Object Of Comparator>)
		lStudnet.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getMarks() - o2.getMarks();
			}
			
			
		});
		
		
		
		
		
		
		
		
		
	}

}
