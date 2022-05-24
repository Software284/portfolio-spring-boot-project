package com.lamichhane.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.portfolio.dao.SpecializeDAO;
import com.lamichhane.portfolio.entity.Specialize;
import com.lamichhane.portfolio.exception.classes.SpecializeNotFoundException;

@Service
public class SpecializeServiceImpl implements SpecializeService{
	
	@Autowired
	private SpecializeDAO specializeDAO;

	/* Specialize API Request Handling */
	
	@Override
	@Transactional
	public List<Specialize> getAllSpecialize() {
		
		return specializeDAO.findAll();
	}

	@Override
	@Transactional
	public void saveSpecialize(Specialize theSpecialize) {
		specializeDAO.save(theSpecialize);
	}

	@Override
	@Transactional
	public Specialize getSpecialize(int theId) {
		Optional<Specialize> spe = specializeDAO.findById(theId);
		if(spe.isEmpty()) {
			throw new SpecializeNotFoundException("Specialize Not Found With Id-"+theId);
		}
		return spe.get();
		
	}

	@Override
	@Transactional
	public void deletSpecialize(int id) {
		specializeDAO.deleteById(id);
	}
	
}
