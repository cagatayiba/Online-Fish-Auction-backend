package com.G01.onlineFishAuction.business;

import com.G01.onlineFishAuction.dataAccess.IAuctionRepository;
import com.G01.onlineFishAuction.entities.Auction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionManager implements IAuctionService {


    private IAuctionRepository iAuctionRepository;

    @Autowired
    public AuctionManager(IAuctionRepository iAuctionRepository) {
        this.iAuctionRepository = iAuctionRepository;
    }

    @Override
    public void add(Auction auction) {
        iAuctionRepository.addAuction(auction);
    }

    @Override
    public List<Auction> getAll() {
        return iAuctionRepository.getAll();
    }
}
