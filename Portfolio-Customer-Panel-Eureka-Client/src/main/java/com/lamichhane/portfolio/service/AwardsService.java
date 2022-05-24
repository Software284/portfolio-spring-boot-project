package com.lamichhane.portfolio.service;

import java.util.List;

import com.lamichhane.portfolio.entity.Awards;
import com.lamichhane.portfolio.entity.ContactDetail;

public interface AwardsService {

	public List<Awards> getAllAwards();
	   
	public void saveAwards(Awards theAwards);

	public Awards getAwards(int id);

	public void deleteAwards(int id);
}
