package com.lamichhane.portfolio.service;

import java.util.List;

import com.lamichhane.portfolio.entity.Stats;

public interface StatsService {

	public List<Stats> getAllStats();
	   
	public void saveStats(Stats theStats);

	public Stats getStats(int id);

	public void deleteStats(int id);
}
