package com.demo;

import java.sql.*;


public class DeletingValues{
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
	Statement st=con.createStatement();
	st.execute("delete from student where id=1");
	con.close();
		
	}

}
