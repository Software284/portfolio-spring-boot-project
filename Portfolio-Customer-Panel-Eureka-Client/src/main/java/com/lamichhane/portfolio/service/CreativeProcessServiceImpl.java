package com.lamichhane.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.portfolio.dao.CreativeProcessDAO;
import com.lamichhane.portfolio.entity.CreativeProcess;
import com.lamichhane.portfolio.exception.classes.CreativeProcessNotFoundException;

@Service
public class CreativeProcessServiceImpl implements CreativeProcessService{
	
	@Autowired
	private CreativeProcessDAO creativeProcessDAO;

	/* Specialize API Request Handling */
	
	@Override
	@Transactional
	public List<CreativeProcess> getAllCreativeProcess() {
		
		return creativeProcessDAO.findAll();
	}

	@Override
	@Transactional
	public void saveCreativeProcess(CreativeProcess theCreativeProcess) {
		creativeProcessDAO.save(theCreativeProcess);
	}

	@Override
	@Transactional
	public CreativeProcess getCreativeProcess(int theId) {
		Optional<CreativeProcess> creativeprocess = creativeProcessDAO.findById(theId);
		if(creativeprocess.isEmpty()) {
			throw new CreativeProcessNotFoundException("CreativeProcess Not Found With Id-"+theId);
		}
		return creativeprocess.get();
		
	}

	@Override
	@Transactional
	public void deleteCreativeProcess(int id) {
		creativeProcessDAO.deleteById(id);
	}
	
}
