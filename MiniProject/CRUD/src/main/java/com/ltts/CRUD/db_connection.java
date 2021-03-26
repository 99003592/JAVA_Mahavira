package com.ltts.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;

public class db_connection {
	public static void main(String[] args) {
		db_connection obj_db_connection = new db_connection();
		
		System.out.println(obj_db_connection.get_connection());
	}
	
	public Connection get_connection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cruddb", "root", "Legion@1998");
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;		
	}
}
