package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connection_Example {

		public static Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url=("jdbc:mysql://localhost:3306/hospital_db");
		String username = "root";
		String password = "admin";
		
		Connection conn = DriverManager.getConnection(url,username,password);
//		if(conn != null) {
//			System.out.println("connection established.........");
//		}else {
//			System.out.println("try again....!!!");
//		}
		return conn;
	}

}
