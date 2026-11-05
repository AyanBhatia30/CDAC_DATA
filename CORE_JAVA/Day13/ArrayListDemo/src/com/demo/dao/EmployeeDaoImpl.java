package com.demo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.comparators.EmployeeNameComparator;
import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;
// sorting ArrayList 
public class EmployeeDaoImpl implements EmployeeDao {
             static List<Employee> elist;
             static {
            	 elist=new ArrayList<>();
            	 elist.add(new SalariedEmp(12,"Rajesh","4444","Hr","mgr",45678));
  	 elist.add(new SalariedEmp(14,"Rajesh","4444","Hr","mgr",45678));
            	 elist.add(new ContractEmp(15,"Meenal","6666","admin","asst",45,6766));
            	 elist.add(new ContractEmp(13,"Rajani","55555","admin","asst",45,6666));
                 
            	 //Collection // interface 
            	 //Collections.sort(elist);
             }
             
             
             
             
             
             
             
			 @Override
			 //add a object in the list at the end
			 public boolean save(Employee e) {
				return elist.add(e);
				
			 }
			 
			 
			 
			 
			 
			 
			 
			 
			 @Override
			 public List<Employee> findAll() {
				return elist;
			 }
			 @Override
			 public Employee findById(int id) {
				 int pos=elist.indexOf(new SalariedEmp(id) );
				 if(pos!=-1) {
					 return elist.get(pos);
				 }
				 return null;
			 }
			 @Override
			 public List<Employee> findByName(String nm) {
				//java 1.7 
				/* List<Employee> lst=new ArrayList<>();
				 Iterator<Employee> it=elist.iterator();
				 while(it.hasNext()) {
					 Employee e=it.next();
					 if(e.getPname().equals(nm)) {
						 lst.add(e);
					 }
				 }
				*/
				 //java 1.7 
				/* List<Employee> lst=new ArrayList<>();
				 for(Employee e: elist) {
					 if(e.getPname().equals(nm)) {
						   ast.add(e);
					 }
				 }*/
				 
				 ///java 1.8 using stream function
				 List<Employee> lst=elist.stream()
						 .filter(e->e.getPname().equals(nm))
						 .collect(Collectors.toList());
				 if(lst.size()>0) {
					 return lst;
				 }else {
					 return null;
				 }
				 
				 
				 
				 
			 }
			 @Override
			 public boolean removeById(int id) {
				 
				 // iterator  
				 
				 for(Employee e : elist) {
					 if(e.getPid() == id) {
						 elist.remove(e);  // list 
					 }
				 } 
				 
				 // Remove using Iterator 
				 Iterator<Employee> ie = elist.iterator();
				 
				 while(ie.hasNext()) {
					 Employee temp = ie.next();
					 if(temp.getPid() == id) {
						 ie.remove();/// Iterator 
					 }
				 }
				 
				 // Employee abstract
				 
				 //  remove - equality --  equals 
				 boolean ans  = elist.contains(new SalariedEmp(id));
				 if(ans) {
				 elist.remove(new SalariedEmp(id));   // equals
				 }  else { 
					 //elist.remove(new ContractEmp(id));
				 }
				
				return  false ;//elist.remove(new SalariedEmp(id));
				
				
			 }
			 @Override
			 public boolean modifySalById(int id, double s) {
				Employee e=findById(id);
				if(e!=null) {
					if(e instanceof SalariedEmp) {
						((SalariedEmp)e).setSal(s);
					}else if(e instanceof ContractEmp) {
						((ContractEmp)e).setCharges(s);
					}else {
						//vendor check
					}
					return true;
				}
				return false;
			 }
			 @Override
			 public List<Employee> sortById() {
				 //create a copy of existing list
				List<Employee> newLst=new ArrayList<>(elist);				
				newLst.sort(null);  //  Comparable 
			Collections.sort(newLst);
				
				//name 
				newLst.sort(new EmployeeNameComparator()); 
				
				return newLst;
				// original data sort 
				// Collections.sort(elist);
			 }
			 @Override
			 public List<Employee> sortByName() {
				 //create a copy of existing list
					List<Employee> elst=new ArrayList<>();
					for(Employee e:elist) {
						elst.add(e);
					}
					//elst.sort(new EmployeeNameComparator());
					return elst;
			 }
			 @Override
			 public List<Employee> sortBySalary() {
				 List<Employee> elst=new ArrayList<>();
					for(Employee e:elist) {
						elst.add(e);
					}
					//elst.sort(new EmployeeSalComparator());
					return elst;
			 }
}
