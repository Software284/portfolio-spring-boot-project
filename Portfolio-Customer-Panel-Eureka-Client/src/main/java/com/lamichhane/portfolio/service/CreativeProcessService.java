package com.lamichhane.portfolio.service;

import java.util.List;

import com.lamichhane.portfolio.entity.CreativeProcess;
import com.lamichhane.portfolio.entity.Specialize;

public interface CreativeProcessService {

	public List<CreativeProcess> getAllCreativeProcess();
	   
	public void saveCreativeProcess(CreativeProcess theCreativeProcess);

	public CreativeProcess getCreativeProcess(int id);

	public void deleteCreativeProcess(int id);
}
