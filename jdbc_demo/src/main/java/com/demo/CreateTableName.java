package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableName {
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
	//load & register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//Establish Connection
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
	//Create a Statement
	Statement st=con.createStatement();
	st.execute("Create table student(id integer,name varchar(20),age integer)");
	System.out.println("table created...");
	//close the connection
	con.close();

}
}
