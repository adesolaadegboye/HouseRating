package com.shebshi.www.HouseRating.domain;

import javax.persistence.Column;

public class User extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 884853790499621821L;

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	@Column(name = "USER_NAME", nullable=false)
	private String userName;	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "PASSWORD", nullable=true)
	private String password;

}
