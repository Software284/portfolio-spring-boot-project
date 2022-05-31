package com.lamichhane.portfolio.service;

import java.util.List;

import com.lamichhane.portfolio.entity.Awards;
import com.lamichhane.portfolio.entity.Partners;

public interface PartnersService {

	public List<Partners> getAllPartners();
	   
	public void savePartners(Partners thePartners);

	public Partners getPartners(int id);

	public void deletePartners(int id);
}
