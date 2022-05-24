package com.lamichhane.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.portfolio.dao.KnowldgeResumeDAO;
import com.lamichhane.portfolio.entity.KnowldgeResume;
import com.lamichhane.portfolio.exception.classes.KnowldgeResumeNotFoundException;

@Service
public class KnowldgeResumeServiceImpl implements KnowldgeResumeService{
	
	@Autowired
	private KnowldgeResumeDAO knowldgeResumeDAO;

	/* Specialize API Request Handling */
	
	@Override
	@Transactional
	public List<KnowldgeResume> getAllKnowldgeResume() {
		
		return knowldgeResumeDAO.findAll();
	}

	@Override
	@Transactional
	public void saveKnowldgeResume(KnowldgeResume theKnowldgeResume) {
		knowldgeResumeDAO.save(theKnowldgeResume);
	}

	@Override
	@Transactional
	public KnowldgeResume getKnowldgeResume(int theId) {
		Optional<KnowldgeResume> knowldgeresume = knowldgeResumeDAO.findById(theId);
		if(knowldgeresume.isEmpty()) {
			throw new KnowldgeResumeNotFoundException("Knowldge Resume Not Found With Id-"+theId);
		}
		return knowldgeresume.get();
		
	}

	@Override
	@Transactional
	public void deleteKnowldgeResume(int id) {
		knowldgeResumeDAO.deleteById(id);
	}
	
}
