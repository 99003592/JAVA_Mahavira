package com.ltts.CRUD;

import java.sql.*;

public class App 
{
   public void create_data(String psnumber,String name,String email) {
	   db_connection obj_db_connection = new db_connection();
	   Connection connection = obj_db_connection.get_connection();
	   
	   PreparedStatement ps = null;
	   
		try {
			String query="insert into employee(psnumber,name,email) values (?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, psnumber);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
   }
   
   public void read_data(String psnumber) {
	   db_connection obj_db_connection = new db_connection();
	   Connection connection = obj_db_connection.get_connection();
	   
	   PreparedStatement ps = null;
	   ResultSet rs = null;
	   
	   try {
		   String query = "select * from employee";
		   ps=connection.prepareStatement(query);
		   rs = ps.executeQuery();
		   while(rs.next()) {
			   System.out.println("PS_no -"+rs.getString("psnumber"));
			   System.out.println("Name -"+rs.getString("name"));
			   System.out.println("email -"+rs.getString("email"));
			   System.out.println("-------------------");
		   }
	   } catch (Exception e) {
			System.out.println(e);
	   }
   }
   
   public void update_data(String psnumber, String new_psnumber, String name, String email) {
	   db_connection obj_db_connection = new db_connection();
	   Connection connection = obj_db_connection.get_connection();
	   
	   PreparedStatement ps = null;
	   	try {
	   		String query="update employee set psnumber=?,name=?,email=? where psnumber=?";
	   		ps=connection.prepareStatement(query);
	   		ps.setString(1, new_psnumber);
	   		ps.setString(2, name);
	   		ps.setString(3, email);
	   		ps.setString(4, psnumber);
	   		ps.executeUpdate();
		} catch (Exception e) {
				System.out.println(e);
		}
   }
   
   public void delete_data(String psnumber) {
	   db_connection obj_db_connection = new db_connection();
	   Connection connection = obj_db_connection.get_connection();
	   
	   PreparedStatement ps = null;
	   	try {
	   		String query="delete from employee where psnumber=?";
	   		ps=connection.prepareStatement(query);
	   		ps.setString(1, psnumber);
	   		ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
   }
   
   public static void main(String[] args) {
	   App objTest = new App();
	   objTest.create_data("99003592", "abhi", "abhi@mail.com");
	   objTest.read_data("99003592");
	   objTest.delete_data("99003592");
	   objTest.read_data("99003592");
   }
}
