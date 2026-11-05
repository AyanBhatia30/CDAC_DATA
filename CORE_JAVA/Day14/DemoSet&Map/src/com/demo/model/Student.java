package com.demo.model;

import java.util.Objects;

public class Student implements Comparable<Student>{
	
	private int id ;
	private String name;
	private int marks ;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(int id) {
		super();
		this.id = id;
	}



	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("in hashCode() " + id);
		return id;// unique 
	}
	
	public int hashCodeOriginal() {
		System.out.println("in hashCode() " + id);
		return Objects.hash(id, marks, name);
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("in equals() ");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return 
				id == other.id; 
				// && marks == other.marks && 
				//Objects.equals(name, other.name);
	}
	
	public boolean equalsAll(Object obj) {
		//s1.equals("asde")
		System.out.println("in equals() ");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return 
				id == other.id && 
				marks == other.marks && 
				Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
	
	
	
	

}
