package com.sample;
import java.sql.*;
public class UpdateValues {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		//load & register the Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Establish Connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
				//Create a Statement
				Statement st=con.createStatement();
				st.execute("update employee set sal=23000,job='clerck' where id=4");
				System.out.println("udation done");
				con.close();
	}

}
