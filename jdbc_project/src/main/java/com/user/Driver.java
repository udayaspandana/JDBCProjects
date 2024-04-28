package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Driver {
	
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Choice");
		System.out.println("1.Register");
		System.out.println("2.Login");
		System.out.println("3.Exit");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1 : User.register();
		         break;
		case 2 : User.login();
		          break;
		case 3 : User.exit();
		          break;
		}
		
	}
	
	

    

}
