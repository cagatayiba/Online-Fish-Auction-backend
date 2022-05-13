package com.G01.onlineFishAuction.entities;

//import javax.persistence.MappedSuperclass;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class User implements IUser{
	@Id
	private String username;
	private String password;
	
	

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public String getPassword() {
		return password;
	}

}
