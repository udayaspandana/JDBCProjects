package com.sample;
import java.sql.*;
public class EstablishConnection {
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		
		System.out.println("ConnectionEstablished");
		
	}

}
