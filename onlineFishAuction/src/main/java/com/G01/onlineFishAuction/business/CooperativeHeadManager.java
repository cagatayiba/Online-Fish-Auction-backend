package com.G01.onlineFishAuction.business;

import java.util.Date;

import com.G01.onlineFishAuction.dataAccess.ICodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.G01.onlineFishAuction.entities.Auction;

@Service
public class CooperativeHeadManager implements ICooperativeHeadService {
	private ICodeRepository iCodeRepository;

	@Autowired
	public CooperativeHeadManager(ICodeRepository iCodeRepository) {
		this.iCodeRepository = iCodeRepository;
	}

	@Override
	public Auction scheduleAuction(Date date, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createCode() {
		return iCodeRepository.generateAndRecord();
	}

}
