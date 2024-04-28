package com.demo;

import java.sql.*;

public class DisplayValues {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		Statement st=con.createStatement();
//		ResultSet rs=st.executeQuery("Select * from student");
//		//process the result
//		while(rs.next())
//		{
//			System.out.println(rs.getInt(3)+" "+rs.getString(2)+" "+rs.getInt(1));
//		}
//		con.close();
		
		ResultSet rs=st.executeQuery("Select name,age from student");
//		process the result
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}
		con.close();
	}

}
