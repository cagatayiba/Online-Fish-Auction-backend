package com.G01.onlineFishAuction.dataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.G01.onlineFishAuction.entities.Fisherman;

@Repository
public class HibernateFishermanRepository implements IFishermanRepository{
	private EntityManager entityManager;
	
	@Autowired
	public HibernateFishermanRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	@Override
	@Transactional
	public void addFisherman(Fisherman fisherman) {
		Session session  = entityManager.unwrap(Session.class);
		session.saveOrUpdate(fisherman);
	}

	@Override
	@Transactional
	public void deleteFisherman(Fisherman fisherman) {
		Session session  = entityManager.unwrap(Session.class);
		Fisherman fishermanToDelete = session.get(Fisherman.class, fisherman.getUsername());
		session.delete(fishermanToDelete);
		
	}


	@Override
	@Transactional
	public List<Fisherman> getAll() {
		Session session  = entityManager.unwrap(Session.class);
		List<Fisherman> allFisherman = session.createQuery("from Fisherman",Fisherman.class).getResultList();
		return allFisherman;
	}
	
}
