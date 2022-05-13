package com.G01.onlineFishAuction.business;

import com.G01.onlineFishAuction.entities.CooperativeHead;
import com.G01.onlineFishAuction.entities.CooperativeMember;
import com.G01.onlineFishAuction.entities.Customer;
import com.G01.onlineFishAuction.entities.Fisherman;

import java.util.List;
public interface IUserService {
	String login(String username, String password);
	void customerRegister(Customer newCustomer);
	void cooperativeMemberRegister(CooperativeMember newMember);
	void fishermanRegister(Fisherman fisherman);
	void deleteCustomer(Customer customer);
	void deleteCooperativeMember(CooperativeMember cooperativeMember);
	void deleteFisherman(Fisherman fisherman);
	List<Customer> getAllCustomers();
	List<CooperativeMember> getAllMembers();
	List<CooperativeHead> getAdmin();
	public List<Fisherman> getFisherman();
}
