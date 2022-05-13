package com.G01.onlineFishAuction.entities;

import lombok.Data;

@Data
public class LoginRequestJSON {
    String loginType;
    String apiSecretKey;
    String userName;
    String password;

    public boolean checkApiSecretKeyIsValid(){
        if (apiSecretKey!=null){
            return apiSecretKey.equals("BastırAnkaraGücü");
        }
        return false;
    }

	public String getLoginType() {
		return loginType;
	}

	public String getApiSecretKey() {
		return apiSecretKey;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
    
    

}
