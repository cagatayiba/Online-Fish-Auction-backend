package com.G01.onlineFishAuction.dataAccess;

import com.G01.onlineFishAuction.entities.Auction;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateAuctionRepository implements  IAuctionRepository{
    private EntityManager entityManager;

    @Autowired
    public HibernateAuctionRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void addAuction(Auction auction) {
        Session session  = entityManager.unwrap(Session.class);
        session.saveOrUpdate(auction);
    }

    @Override
    @Transactional
    public List<Auction> getAll() {
        Session session  = entityManager.unwrap(Session.class);
        List<Auction> auctions = session.createQuery("from Auction", Auction.class).getResultList();
        return auctions;
    }


}
