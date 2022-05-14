package com.G01.onlineFishAuction.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Code")
public class Code {
	@Id
	@Column(name="memberCode")
	String memberCode;

	public Code(String memberCode) {
		super();
		this.memberCode = memberCode;
	}
	
	public Code() {
		
	}

	public String getMemberCode() {
		return memberCode;
	}
	
	
}
