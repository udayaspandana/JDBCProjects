package com.sample;

import java.sql.*;


public class DisplayValues {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
 
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("Select * from employee");	
	while(rs.next())
	{
		System.out.println(rs.getInt(4)+" "+rs.getString(3)+" "+rs.getString(2)+" "+rs.getInt(1));
	}
	con.close();
}
}
