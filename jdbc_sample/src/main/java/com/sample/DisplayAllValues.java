package com.sample;
import java.sql.*;
public class DisplayAllValues {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("Select name,job from employee");
//		process the result
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
		con.close();
		
	}
}
