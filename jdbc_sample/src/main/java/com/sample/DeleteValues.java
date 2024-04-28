package com.sample;
import java.sql.*;
public class DeleteValues {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		
	Statement st=con.createStatement();
	st.execute("delete from employee where sal<24000");
	con.close();
		
	}


}
