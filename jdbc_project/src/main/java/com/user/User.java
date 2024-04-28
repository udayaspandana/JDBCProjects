package com.user;
import java.sql.*;
import java.util.Scanner;
public class User {
	
	     public static Connection getConnection() throws SQLException,ClassNotFoundException {
	    	 
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project","root","root");
	    	 return con;
	     }
	     
	     
	     public static void register() throws ClassNotFoundException,SQLException
	     {
	    	 Connection con=getConnection();
	    	 PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?)");
	    	 Scanner sc=new Scanner(System.in);
		 
		    System.out.println("enter id:");
		    int id=sc.nextInt();
	        System.out.println("Enter your name:");
	        String name = sc.next();
	        System.out.println("Enter your phone number:");
	        long phone_number = sc.nextLong();
	        System.out.println("Enter your email:");
	        String email = sc.next();
	        System.out.println("Enter your password:");
	        String password = sc.nextLine();
       
	        ps.setInt(1, id);
	        ps.setString(2, name);
	        ps.setLong(3, phone_number);
	        ps.setString(4, email);
	        ps.setString(5, password);
	        ps.executeUpdate();
	        System.out.println("User has Successfully Registered");

//	        int rowsAffected = ps.executeUpdate();
//	        if (rowsAffected > 0) {
//	            System.out.println("Registration successful!");
//	        } else {
//	            System.out.println("Registration failed. Please try again.");
//	        }
	    }

	        public static void login() throws SQLException,ClassNotFoundException {
	        
	        Connection con=getConnection();
	        Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery("select email,password form user");
	        	
	        Scanner sc=new Scanner(System.in);	
	        System.out.println("Enter your email:");
	        String email = sc.next();
	        System.out.println("Enter your password:");
	        String password = sc.nextLine();
	        
	        while(rs.next())
	        {
	        	if(rs.getString(1).equals(email) && rs.getString(2).equals(password))
	        	{
	        		System.out.println("1.Details");
	        		System.out.println("2.logout");
	        		System.out.println("Enter your choice");
	        		int choice=sc.nextInt();
	        		if(choice==1)
	        		{
	        			PreparedStatement ps=con.prepareStatement("Select * from user where email=?");
	        			System.out.println("Enter the email Address for the details");
	        			String s2=sc.next();
	        			ps.setString(1, s2);
	        			ResultSet rs1=ps.executeQuery();
	        			
	        			while(rs1.next())
	        			{
	        				System.out.println("id :"+rs1.getInt(1));
	        				System.out.println("Name :"+rs1.getString(2));
	        				System.out.println("phone_number :"+rs1.getString(3));
	        				System.out.println("email :"+rs1.getString(4));
	        			}
	        		}
	        		else
	        		{
	        			System.out.println("user logged out Successfully");
	        		}
	        	}
	        	else
	        	{
	        		System.out.println("first register yourself for login");
	        		register();
	        	}
	        }
           con.close();
    
	    }
	        public static void exit()
	        {
	        	System.out.println("user has exited successfully");
	        }
	
	
}