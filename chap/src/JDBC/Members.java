package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oracle.jdbc.proxy.annotation.Pre;


class Members{
	private int userId;
	private String userName, email, phoneNo;
	private String userPwd, regDate;

	public Members(int userId, String userPwd, String userName, String email, String phoneNo,  String regDate) {
		this.userId = userId; this.userName = userName; this.email = email; this.phoneNo = phoneNo;
		this.userPwd = userPwd; this.regDate = regDate;
	}
	
	public Members(String userPwd, String userName, String email, String phoneNo) {
		this.userPwd = userPwd; this.userName = userName; this.email = email; this.phoneNo = phoneNo;
	}
	
	public Members(int userId ,String userPwd, String userName, String email, String phoneNo) {
		this.userId = userId; this.userPwd = userPwd; this.userName = userName; this.email = email; this.phoneNo = phoneNo;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getRegDate() {
		return regDate;
	}

	public String toString(){
		return String.format("[userId=%d, userPwd=%s, userName=%s, email=%s, phoneNo=%s, regDate=%s]", 
				userId, userPwd, userName, email, phoneNo,  regDate);
	}

}
