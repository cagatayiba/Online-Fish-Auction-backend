package com.G01.onlineFishAuction.dataAccess;

public interface ICodeRepository {
	String generateAndRecord();
	void delete(String code);   
}
