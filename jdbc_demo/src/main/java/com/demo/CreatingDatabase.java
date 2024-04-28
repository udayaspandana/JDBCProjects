package com.demo;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class CreatingDatabase {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
	//load & register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//Establish Connection
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	//Create a Statement
	Statement st=con.createStatement();
	//execute the query
	st.execute("create database school");
	System.out.println("database created");
	//close the connection
	con.close();

}
}