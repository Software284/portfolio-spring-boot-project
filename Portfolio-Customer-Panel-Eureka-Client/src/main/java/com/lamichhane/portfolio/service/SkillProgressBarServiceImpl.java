package com.lamichhane.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.portfolio.dao.SkillProgressBarDAO;
import com.lamichhane.portfolio.entity.SkillProgressBar;
import com.lamichhane.portfolio.exception.classes.SkillProgressBarNotFoundException;

@Service
public class SkillProgressBarServiceImpl implements SkillProgressBarService{
	
	@Autowired
	private SkillProgressBarDAO skillProgressBarDAO;

	
	
	@Override
	@Transactional
	public List<SkillProgressBar> getAllSkillProgressBar() {
		
		return skillProgressBarDAO.findAll();
	}

	@Override
	@Transactional
	public void saveSkillProgressBar(SkillProgressBar theSkillProgressBar) {
		skillProgressBarDAO.save(theSkillProgressBar);
	}

	@Override
	@Transactional
	public SkillProgressBar getSkillProgressBar(int theId) {
		Optional<SkillProgressBar> skill_progressbar = skillProgressBarDAO.findById(theId);
		if(skill_progressbar.isEmpty()) {
			throw new SkillProgressBarNotFoundException("Skill Progressbar Detail Not Found With Id-"+theId);
		}
		return skill_progressbar.get();
		
	}

	@Override
	@Transactional
	public void deleteSkillProgressBar(int id) {
		skillProgressBarDAO.deleteById(id);
	}
	
}
