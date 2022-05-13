package com.G01.onlineFishAuction.dataAccess;

import java.util.List;

import com.G01.onlineFishAuction.entities.Customer;

public interface ICustomerRepository {
	List<Customer> getAll();
	Customer getCustomer(String username);
	void recordCustomer(Customer customer);
	void deleteCustomer(Customer customer);

}
