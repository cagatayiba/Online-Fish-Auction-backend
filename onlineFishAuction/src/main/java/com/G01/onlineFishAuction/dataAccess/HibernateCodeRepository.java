package com.G01.onlineFishAuction.dataAccess;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;

import com.G01.onlineFishAuction.entities.Code;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.G01.onlineFishAuction.entities.Customer;

@Repository
public class HibernateCodeRepository implements ICodeRepository{
	private EntityManager entityManager;
	
	@Autowired
	public HibernateCodeRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	public String generateAndRecord() {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 8;
		Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit + 1)
				.limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();


		Session session  = entityManager.unwrap(Session.class);

		Code newCodeObject = new Code(generatedString);
		session.saveOrUpdate(newCodeObject);
		return generatedString;

	}

	@Override
	public void delete(String code) {
		Session session  = entityManager.unwrap(Session.class);
		
	}

}
