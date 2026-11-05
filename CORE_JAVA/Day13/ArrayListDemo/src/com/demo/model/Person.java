package com.demo.model;

import java.util.Objects;
// id 
public class Person implements Comparable<Person>{
	private int pid;
	private String pname;
	private String mob;
	public Person() {
		//System.out.println("in Person default constructor");
	}
	public Person(int pid, String pname, String mob) {
		//System.out.println("in Person parametrised constructor");
		this.pid = pid;
		this.pname = pname;
		this.mob = mob;
	}
	
	public Person(int id) {
		pid=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		System.out.println("in persons equals method  "+this.pid+"--------"+other.pid);
		return this.pid == other.pid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mob=" + mob + "]";
	}
	
	public int compareTo1(Person o) {
		System.out.println("in compareTo method "+this.pid+"-------"+o.pid);
		/*if(this.pid<o.pid)
			return -1;
		else if(this.pid==o.pid) {
			return 0;
		}else {
			return 1;
		}*/ 
		            
		return this.pid-o.pid;
		//return (int)(this.sal-o.sal);
		//return this.pname.compareTo(o.pname)
	}	
	
	
	
	
	//person   sort   Comparable interface 
	
	public int compareTo2(Object o) {
		Person temp = null ; 
		if(o instanceof Person) {
			temp = (Person) o;
		}		
		if(this.pid > temp.pid)
			return 1;
		if(this.pid < temp.pid)
			return -1;
		else
		return 0;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.pid - o.pid;// sorting 
		// String 
		//return (this.pname.compareTo(o.pname));
	}
	

}




