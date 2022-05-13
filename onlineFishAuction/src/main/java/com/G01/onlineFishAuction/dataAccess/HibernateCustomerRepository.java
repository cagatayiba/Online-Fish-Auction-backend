package com.G01.onlineFishAuction.dataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;

import com.G01.onlineFishAuction.entities.Customer;

@Repository
public class HibernateCustomerRepository implements ICustomerRepository{
	private EntityManager entityManager;
	
	@Autowired
	public HibernateCustomerRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Customer> getAll() {
		Session session  = entityManager.unwrap(Session.class);
		List<Customer> customers = session.createQuery("from Customer", Customer.class).getResultList();
		return customers;
		
	}

	@Override
	@Transactional
	public Customer getCustomer(String username) {
		Session session  = entityManager.unwrap(Session.class);
		Customer customer = session.get(Customer.class, username);
		return customer;
	}

	@Override
	@Transactional
	public void recordCustomer(Customer customer) {
		Session session  = entityManager.unwrap(Session.class);
		session.saveOrUpdate(customer);
		
	}
	
	@Override
	@Transactional
	public void deleteCustomer(Customer customer) {
		Session session  = entityManager.unwrap(Session.class);
		Customer customerToDelete = session.get(Customer.class, customer.getUsername());
		session.delete(customerToDelete);
	}

}
