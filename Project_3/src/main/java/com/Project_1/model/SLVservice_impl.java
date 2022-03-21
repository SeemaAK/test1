package com.Project_1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SLVservice_impl implements SLVservice {
	private Connection con;
	private Statement stmnt;

	@Override
	public void ConnectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "toor");
			stmnt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean verifylogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from student where email='"+email+"' and password='"+password+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public void register(String name, String city, String email, String mobile) {
		try {
			stmnt.executeUpdate("insert into studentdetails values ('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public ResultSet ReadReg() {
		try {
			ResultSet result=stmnt.executeQuery("select * from studentdetails");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
