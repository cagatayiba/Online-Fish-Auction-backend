package com.G01.onlineFishAuction.business;

import com.G01.onlineFishAuction.entities.Auction;
import java.util.List;

public interface IAuctionService {
    public void add(Auction auction);
    public List<Auction> getAll();
}
