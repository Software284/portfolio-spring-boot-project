package com.lamichhane.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.portfolio.dao.StatsDAO;
import com.lamichhane.portfolio.entity.Stats;
import com.lamichhane.portfolio.exception.classes.SpecializeNotFoundException;

@Service
public class StatsServiceImpl implements StatsService{
	
	
	@Autowired
	private StatsDAO statsDAO;

	/* Specialize API Request Handling */
	
	@Override
	@Transactional
	public List<Stats> getAllStats() {
		
		return statsDAO.findAll();
	}

	@Override
	@Transactional
	public void saveStats(Stats theStats) {
		statsDAO.save(theStats);
	}

	@Override
	@Transactional
	public Stats getStats(int theId) {
		Optional<Stats> sts = statsDAO.findById(theId);
		if(sts.isEmpty()) {
			throw new SpecializeNotFoundException("Stats Not Found With Id-"+theId);
		}
		return sts.get();
		
	}

	@Override
	@Transactional
	public void deleteStats(int id) {
		statsDAO.deleteById(id);
	}
	
}
