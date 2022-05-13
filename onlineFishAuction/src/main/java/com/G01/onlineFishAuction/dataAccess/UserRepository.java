package com.G01.onlineFishAuction.dataAccess;

//import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.G01.onlineFishAuction.entities.CooperativeMember;
import com.G01.onlineFishAuction.entities.Customer;
import com.G01.onlineFishAuction.entities.IUser;

@Repository
public class UserRepository implements IUserRepository{
	private EntityManager entityManager;
	
	@Autowired
	public UserRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public String checkLoginData(String username, String password) {
		Session session  = entityManager.unwrap(Session.class);
		IUser user;
		if((user = session.get(Customer.class,username)) != null) {
			return user.getPassword().equals(password) ? "Customer" : null;
		
		}else if((user = session.get(CooperativeMember.class,username)) != null) {
			
			return user.getPassword().equals(password) ? "cooperativeMember" : null;
		}else {
			return null;
		}
	}

	

}
