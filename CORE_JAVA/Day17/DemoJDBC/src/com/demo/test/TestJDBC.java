package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJDBC {

	public static void main(String[] args) {
		
		// Driver load -- mysql 
		
		try {
			
			// confgiure build path - > add external jar file 
			// mysqlConnector
			Class.forName("com.mysql.cj.jdbc.Driver");		
			System.out.println("Driver Loaded ");
			String url = "jdbc:mysql://192.168.10.144:3306/dac120";
			String username = "dac120";
			String password = "welcome";			
			Connection con = null;			
			con = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection " + con);
			
			String query = "Select *  from Product";			
			Statement st = con.createStatement();// query			
			ResultSet rs = st.executeQuery(query);			
			while(rs.next())// move to next row
			{
				System.out.print(rs.getInt(1) + " ");// pid  col index 
				System.out.print(rs.getString("pname") + " " );
				System.out.println(rs.getDouble(3));
			}
			
			
			// data accept from user
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Product ID  : ");
			int id  = sc.nextInt();
			System.out.print("Enter Product NAME  : ");
			String name  = sc.next();
			System.out.print("Enter Product price  : ");
			double price  = sc.nextDouble();
String insert1 
= "Insert into Product values (" + id +", '"+ name +"',"+ price+")";		 
			String insert 
= "Insert into Product values (103 , 'mobile',25685.5)";
			//DML  insert update  delete 
			int rows = st.executeUpdate(insert);
			
			System.out.println(rows + " affected");
			
	PreparedStatement pst ; /// pre compiled statement cache
			
			String pInsert 
	= "Insert into Product values (?,?,?)";	// place holder 
			pst = con.prepareStatement(pInsert);
			//user 
			pst.setInt(1, 123);
			pst.setString(2, "new");
			pst.setDouble(3, 152685.0);
			
			int c = pst.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
