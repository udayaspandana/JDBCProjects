package com.demo;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class UpdatingValuesDynamically {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
		PreparedStatement ps=con.prepareStatement("update student set name=? where age=?");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String Name=sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		ps.setString(1, Name);
		ps.setInt(2,age);
		
		ps.executeUpdate();
		
		con.close();
	}

}
