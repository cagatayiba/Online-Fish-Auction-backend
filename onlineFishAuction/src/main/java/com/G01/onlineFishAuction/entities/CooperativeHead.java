package com.G01.onlineFishAuction.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cooperativehead")
public class CooperativeHead implements IUser{
	@Id
	@Column(name="username")
	String username;
	@Column(name="password")
	String password;
	@Column(name="mail")
	String mail;
	
	
	public CooperativeHead(String username, String password, String mail) {
		super();
		this.username = username;
		this.password = password;
		this.mail = mail;
	}
	public CooperativeHead() {
		
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getMail() {
		return mail;
	}
	
	
	

}
