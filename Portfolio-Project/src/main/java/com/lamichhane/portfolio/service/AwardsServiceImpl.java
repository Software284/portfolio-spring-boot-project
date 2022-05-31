package com.lamichhane.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.portfolio.dao.AwardsDAO;
import com.lamichhane.portfolio.entity.Awards;
import com.lamichhane.portfolio.exception.classes.AwardsNotFoundException;

@Service
public class AwardsServiceImpl implements AwardsService{
	
	@Autowired
	private AwardsDAO awardsDAO;

	
	@Override
	@Transactional
	public List<Awards> getAllAwards() {
		
		return awardsDAO.findAll();
	}

	@Override
	@Transactional
	public void saveAwards(Awards theAwards) {
		awardsDAO.save(theAwards);
	}

	@Override
	@Transactional
	public Awards getAwards(int theId) {
		Optional<Awards> awards = awardsDAO.findById(theId);
		if(awards.isEmpty()) {
			throw new AwardsNotFoundException("Award Not Found With Id-"+theId);
		}
		return awards.get();
		
	}

	@Override
	@Transactional
	public void deleteAwards(int id) {
		awardsDAO.deleteById(id);
	}
	
}
