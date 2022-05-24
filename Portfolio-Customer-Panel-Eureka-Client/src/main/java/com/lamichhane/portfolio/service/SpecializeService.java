package com.lamichhane.portfolio.service;

import java.util.List;

import com.lamichhane.portfolio.entity.Specialize;

public interface SpecializeService {

	public List<Specialize> getAllSpecialize();
	   
	public void saveSpecialize(Specialize theSpecialize);

	public Specialize getSpecialize(int id);

	public void deletSpecialize(int id);
}
