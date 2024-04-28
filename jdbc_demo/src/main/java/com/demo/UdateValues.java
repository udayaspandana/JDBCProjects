package com.demo;

import java.sql.*;


public class UdateValues {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		//load & register the Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Establish Connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
				//Create a Statement
				Statement st=con.createStatement();
				st.execute("update student set name='Spandana' where id=3");
				System.out.println("udation done");
				con.close();
	}

}
