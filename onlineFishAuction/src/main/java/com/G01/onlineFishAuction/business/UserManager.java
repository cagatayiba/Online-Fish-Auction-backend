package com.G01.onlineFishAuction.business;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.G01.onlineFishAuction.dataAccess.ICooperativeHeadRepository;
import com.G01.onlineFishAuction.dataAccess.ICooperativeMemberRepository;
import com.G01.onlineFishAuction.dataAccess.ICustomerRepository;
import com.G01.onlineFishAuction.dataAccess.IFishermanRepository;
import com.G01.onlineFishAuction.dataAccess.IUserRepository;
import com.G01.onlineFishAuction.entities.CooperativeHead;
import com.G01.onlineFishAuction.entities.CooperativeMember;
import com.G01.onlineFishAuction.entities.Customer;
import com.G01.onlineFishAuction.entities.Fisherman;

@Service
public class UserManager implements IUserService {

	ICustomerRepository customerRepository;
	IUserRepository userRepository;
	ICooperativeMemberRepository cooperativeMemberRepository;
	ICooperativeHeadRepository cooperativeHeadRepository;
	IFishermanRepository fishermanRepository;
	
	
	@Autowired
	public UserManager(ICustomerRepository customerRepository, IUserRepository userRepository,
			ICooperativeMemberRepository cooperativeMemberRepository,
			ICooperativeHeadRepository cooperativeHeadRepository, IFishermanRepository fishermanRepository) {
		//super();
		this.customerRepository = customerRepository;
		this.userRepository = userRepository;
		this.cooperativeMemberRepository = cooperativeMemberRepository;
		this.cooperativeHeadRepository = cooperativeHeadRepository;
		this.fishermanRepository = fishermanRepository;
	}
	
	

	@Override
	@Transactional
	public String login(String username, String password) {
		return userRepository.checkLoginData(username, password);
		
	}
	
	@Override
	@Transactional
	public void customerRegister(Customer newCustomer) {
		customerRepository.recordCustomer(newCustomer);
		
	}

	@Override
	@Transactional
	public void cooperativeMemberRegister(CooperativeMember newMember) {
		cooperativeMemberRepository.recordMember(newMember);
		
	}

	@Override
	@Transactional
	public void deleteCustomer(Customer customer) {
		customerRepository.deleteCustomer(customer);
		
	}

	@Override
	@Transactional
	public void deleteCooperativeMember(CooperativeMember cooperativeMember) {
		cooperativeMemberRepository.delete(cooperativeMember);
		
	}



	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		return customerRepository.getAll();
	}


	@Override
	@Transactional
	public List<CooperativeMember> getAllMembers() {
		return cooperativeMemberRepository.getAll();
	}



	@Override
	@Transactional
	public List<CooperativeHead> getAdmin() {
		return cooperativeHeadRepository.get();
	}



	@Override
	@Transactional
	public List<Fisherman> getFisherman() {
		return fishermanRepository.getAll();
	}



	@Override
	@Transactional
	public void fishermanRegister(Fisherman fisherman) {
		fishermanRepository.addFisherman(fisherman);
		
	}



	@Override
	@Transactional
	public void deleteFisherman(Fisherman fisherman) {
		fishermanRepository.deleteFisherman(fisherman);
		
	}

}
