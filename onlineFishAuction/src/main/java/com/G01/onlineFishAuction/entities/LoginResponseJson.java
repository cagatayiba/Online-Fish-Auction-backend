package com.G01.onlineFishAuction.entities;



import java.util.Date;

import lombok.Data;

@Data
public class LoginResponseJson {
    int status;
    String message;
    long dateTimeObject;
    String path;
    String userType;

    public LoginResponseJson(int status, String message, String path,String userType) {
        this.status = status;
        this.message = message;
        this.dateTimeObject = new Date().getTime();
        this.path = path;
        this.userType = userType;
    }

	public int getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public long getDateTimeObject() {
		return dateTimeObject;
	}

	public String getPath() {
		return path;
	}

	public String getUserType() {
		return userType;
	}
    
    
}
