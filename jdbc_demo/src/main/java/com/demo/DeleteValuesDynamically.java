package com.demo;
import java.sql.*;
import java.util.Scanner;
public class DeleteValuesDynamically {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
		PreparedStatement ps=con.prepareStatement("delete student set where id=?");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		
		ps.setInt(1,id);
		
		ps.executeUpdate();
		
		con.close();
	}

}
