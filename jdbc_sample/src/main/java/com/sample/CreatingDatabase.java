package com.sample;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreatingDatabase {
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		
		Statement st=con.createStatement();
		
		st.execute("Create Database Company");
		
		System.out.println("database created");
		con.close();
		
	}

}
