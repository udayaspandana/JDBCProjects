package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicInsertion {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
		//create a statement using preparedStatement
		//--------------Step 1-create dynamic quary using placeholder
		//create dynamic SQL Query
		
		PreparedStatement ps=con.prepareStatement
				("insert into student values(?,?,?)");
		//--------------Step 2----take input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id");
		int id=sc.nextInt();
		System.out.println("Enter student name");
		String name=sc.next();
		System.out.println("Enter student age");
		int age=sc.nextInt();
		
		//--------Step 3--------
		//Set user given values in place holder in the query
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setInt(3, age);
		
		//---------Step 4----------
		ps.executeUpdate();
		
		con.close();
	
	}

}
;
