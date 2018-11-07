package com.felipesarabia.development.training.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class JdbcConnection {
	private static Connection conn;
	private static final String driver= "com.mysql.jdbc.Driver";
	private static final String user= "root";
	private static final String pswd= "";
	private static final String db= "jdbc:mysql://localhost/3306/javadev";
	
	public JdbcConnection() {
		conn=null;
		
		try {
			Class.forName(driver);
			
			conn = (Connection) DriverManager.getConnection(db,user,pswd);
			if(conn != null)
				System.out.println("Connection");
		}
		catch(SQLException e) {
			
		}
		catch(ClassNotFoundException e) {
			
		}
		catch(Exception e) {
			
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
}
