package com.demo.test;

import com.demo.beans.Employee;
import com.demo.linkedlists.SinglyLinkedListEmployee;

public class TestSinglyLinkedListEmployee {
	public static void main(String[] args) {
		SinglyLinkedListEmployee lst=new SinglyLinkedListEmployee();
		lst.addNode(new Employee(12,"Ashu",56789));
		lst.addNode(new Employee(13,"Amit",57789));
		lst.addNode(new Employee(14,"Meena",46789));
		lst.addNode(new Employee(15,"Radha",36789));
		lst.displayAll();
		lst.addAfterGivenId(new Employee(11,"Tanaya",45678), 12);
		lst.addAfterGivenId(new Employee(17,"Kanchan",44678), 15);
		lst.displayAll();
		lst.addByPosition(new Employee(10,"arti",45454),1);
		lst.addByPosition(new Employee(21,"Ajay",75757),5);
	    lst.displayAll();
	    lst.deleteById(14);
	    lst.deleteById(10);
	    lst.displayAll();
	    lst.deleteByPosition(1);
	    lst.deleteByPosition(4);
	    lst.displayAll();

	}
}
