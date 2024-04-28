package com.demo;

import java.sql.*;

public class InsertingValues {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		//load & register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		//Create a Statement
		Statement st=con.createStatement();
		st.execute("insert into student values(1,'rahul',23)");
		st.execute("insert into student values(2,'teja',24)");
		st.execute("insert into student values(3,'dhanu',25)");
		System.out.println("Values inserted...");
		con.close();
	}

}
