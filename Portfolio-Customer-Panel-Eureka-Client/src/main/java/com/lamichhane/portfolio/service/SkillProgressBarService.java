package com.lamichhane.portfolio.service;

import java.util.List;

import com.lamichhane.portfolio.entity.ContactDetail;
import com.lamichhane.portfolio.entity.SkillProgressBar;

public interface SkillProgressBarService {

	public List<SkillProgressBar> getAllSkillProgressBar();
	   
	public void saveSkillProgressBar(SkillProgressBar theSkillProgressBar);

	public SkillProgressBar getSkillProgressBar(int id);

	public void deleteSkillProgressBar(int id);
}
