package com.RMGYantra_Generic_Librerry;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {

	public Connection con =null;
	public 	ResultSet res;

	@Test
	public void connecttoDataBase()
	{
		try
		{
			Driver  d = new Driver();
			DriverManager.registerDriver(d);	
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root", "root");
		} 

		catch(Exception e) {
		}

	}
	public void closeBD() throws SQLException 
	{
		con.close();
	}
	public ResultSet executeQuery(String query) throws Throwable
	{
		ResultSet res = con.createStatement().executeQuery(query);
		return res;
	}

}
