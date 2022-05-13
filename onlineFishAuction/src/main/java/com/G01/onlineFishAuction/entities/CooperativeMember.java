package com.G01.onlineFishAuction.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cooperativemember")
public class CooperativeMember implements IUser{
	@Id
	@Column(name="username")
	String username;
	@Column(name="mail")
	String mail;
	@Column(name="password")
	String password;
	
	
	public CooperativeMember(String username, String mail, String password) {
		super();
		this.username = username;
		this.mail = mail;
		this.password = password;
	}
	
	public CooperativeMember() {
		
	}

	@Override
	public String getUsername() {
		return username;
	}

	public String getMail() {
		return mail;
	}
	
	@Override
	public String getPassword() {
		return password;
	}
	
	

}
