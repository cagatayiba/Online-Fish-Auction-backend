package com.G01.onlineFishAuction.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fisherman")
public class Fisherman implements IUser{
	@Id
	@Column(name="username")
	String username;
	@Column(name="password")
	String password;
	@Column(name="mail")
	String mail;
	@Column(name="iban")
	String iban;
	@Column(name="owner")
	String owner;
	
	
	public Fisherman(String username, String password, String mail, String iban, String owner) {
		super();
		this.username = username;
		this.password = password;
		this.mail = mail;
		this.iban = iban;
		this.owner = owner;
	}
	public Fisherman() {
		
	}
	
	
	public String getMail() {
		return mail;
	}


	public String getIban() {
		return iban;
	}


	public String getOwner() {
		return owner;
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
