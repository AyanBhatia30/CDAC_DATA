package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Product;
/// Database   query 
// Connection 
public class ProductDAOImpl implements productOperations{

	Connection con ;
	
	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public Connection getCon() {
		Connection temp = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://192.168.10.144:3306/dac120";
			temp = DriverManager.getConnection(url, "dac120", "welcome");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		List<Product> lProduct = new ArrayList<>();
		String sql = "Select * from Product";
		
		con = getCon();
		
		try {
			Statement st = con.createStatement();
			
			boolean ans = st.execute(sql);			
			if(ans) {				
				ResultSet rs = st.getResultSet();
				
				while(rs.next()) {
					int i = rs.getInt("pid");
					String n = rs.getString(2);
					double d = rs.getDouble(3);
					
					Product p = new Product(i , n , d);
					
					lProduct .add(p);
					
				}
				
				
			} else { 				
				int count = st.getUpdateCount();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lProduct;
	}

}






