package com.pharmacystore.connection;



import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


public class DbConnection  {

	public static Connection getDatabaseConnection() 
	{
		Connection con = null;
		
		try {
			
			Class.forName(DbDetails.DBDRIVER);
			
			con = DriverManager.getConnection(
					DbDetails.CONSTR,
					DbDetails.USERNAME,
					DbDetails.PASSWORD);
			
		}
		catch(Exception e) {
			e.printStackTrace();		
			return null;
			}
		
	
		return con;
		
	}

//	public String history() throws ClassNotFoundException, SQLException
//	{
//		String g="";
//		Connection con=getDatabaseConnection();
//		String qr="select * from admin";
//		Statement s= con.createStatement();
//		ResultSet rs=s.executeQuery(qr);
//	
//	while(rs.next())
//	{
//			g=rs.getString(1);
//			
//	}
//		return g;
//	}
//	public static void main(String args[]) {
//		try {
//			String g="";
//			Connection con=getDatabaseConnection();
//			String qr="select * from admin";
//			Statement s= con.createStatement();
//			ResultSet rs=s.executeQuery(qr);
//		
//		while(rs.next())
//		{
//			System.out.println(rs.getString(1)); 
//				
//		}
//		
//		}
//		catch(Exception e) {
//			
//		}
//	}
}


