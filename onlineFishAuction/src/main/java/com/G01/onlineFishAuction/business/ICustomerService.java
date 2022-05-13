package com.G01.onlineFishAuction.business;

public interface ICustomerService {
	void joinAuction(String username);
	void makeBid(float amount, String username);
	void makePayment();
	void pay();
	void enterTheCart(String username);
	void enterPurchaseHistory();
	void enterPaymentInfo();
	//void addNewCard();

}
