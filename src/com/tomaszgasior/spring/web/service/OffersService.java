package com.tomaszgasior.spring.web.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tomaszgasior.spring.web.dao.Offer;
import com.tomaszgasior.spring.web.dao.OffersDAO;

@Service("offersService")
public class OffersService {
	
	private OffersDAO offersDao;

	@Autowired
	public void setOffersDao(OffersDAO offersDao) {
		this.offersDao = offersDao;
	}

	public List<Offer> getCurrent(){
		return offersDao.getOffers();
	}

	public void create(Offer offer) {
		
		System.out.println("adding offer to db");
		offersDao.create(offer);
		
	}

	public void throwTestException() {
		
		offersDao.getOffer(99999);
		
	}
}
