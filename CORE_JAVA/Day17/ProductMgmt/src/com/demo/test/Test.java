package com.demo.test;

import java.util.List;

import com.demo.dao.ProductDAOImpl;
import com.demo.dao.productOperations;
import com.demo.model.Product;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		productOperations po  = new ProductDAOImpl();
		
		List<Product> l = po.getAll();
		
		l.forEach(System.out::println);
		
		

	}

}











