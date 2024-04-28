package com.sample;
import java.sql.*;
public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
	//load & register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//Establish Connection
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
	//Create a Statement
	Statement st=con.createStatement();
	st.execute("Create table employee(id integer,name varchar(20),job varchar(20),sal integer)");
	System.out.println("table created...");
	//close the connection
	con.close();

}
}
