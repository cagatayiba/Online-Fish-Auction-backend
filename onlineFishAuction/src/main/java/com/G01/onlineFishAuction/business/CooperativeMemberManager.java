package com.G01.onlineFishAuction.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.G01.onlineFishAuction.dataAccess.IFishRepository;
import com.G01.onlineFishAuction.dataAccess.IFishermanRepository;
import com.G01.onlineFishAuction.entities.Fisherman;

@Service
public class CooperativeMemberManager implements ICooperativeMemberService{
	private IFishRepository fishRepository;
	//ISaleRepository saleRepository;
	private IFishermanRepository fishermanRepository;
	@Autowired
	public CooperativeMemberManager(IFishRepository fishRepository, IFishermanRepository fishermanRepository) {
		super();
		this.fishRepository = fishRepository;
		this.fishermanRepository = fishermanRepository;
	}
	public CooperativeMemberManager() {
		
	}

	@Override
	public void addFish() {
		
		
	}

	@Override
	@Transactional
	public void registerFisherman(Fisherman fisherman) {
		fishermanRepository.addFisherman(fisherman);		
	}

}
