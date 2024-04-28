package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingValues {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
	
		Statement st=con.createStatement();
		st.execute("insert into employee values(1,'rahul','developer',23000)");
		st.execute("insert into employee values(2,'teja','testing',24000)");
		st.execute("insert into employee values(3,'dhanu','manager',25000)");
		System.out.println("Values inserted...");
		con.close();
	}

}
