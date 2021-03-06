package com.lamichhane.portfolio.service;

import java.util.List;

import com.lamichhane.portfolio.entity.KnowldgeResume;
import com.lamichhane.portfolio.entity.Specialize;

public interface KnowldgeResumeService {

	public List<KnowldgeResume> getAllKnowldgeResume();
	   
	public void saveKnowldgeResume(KnowldgeResume theKnowldgeResume);

	public KnowldgeResume getKnowldgeResume(int id);

	public void deleteKnowldgeResume(int id);
}
