package com.Project_1.model;

import java.sql.ResultSet;

public interface SLVservice {

	public void ConnectDB();
	public boolean verifylogin(String email, String password);
	public void register(String name, String city, String email, String mobile);
	public ResultSet ReadReg();

}
