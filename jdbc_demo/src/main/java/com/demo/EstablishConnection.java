package com.demo;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishConnection {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		//load & register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		System.out.println("ConnectionEstablished");
		
	}

}
