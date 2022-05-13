package com.G01.onlineFishAuction.dataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.G01.onlineFishAuction.entities.CooperativeHead;
@Repository
public class HibernateCooperativeHeadRepository implements ICooperativeHeadRepository{
	private EntityManager entityManager;
	
	@Autowired
	public HibernateCooperativeHeadRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	@Transactional
	public List<CooperativeHead> get() {
		Session session  = entityManager.unwrap(Session.class);
		List<CooperativeHead> admin = session.createQuery("from CooperativeHead", CooperativeHead.class).getResultList();
		return admin;
	}

}
