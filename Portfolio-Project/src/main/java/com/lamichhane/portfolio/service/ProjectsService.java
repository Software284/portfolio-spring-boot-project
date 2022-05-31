package com.lamichhane.portfolio.service;

import java.util.List;

import com.lamichhane.portfolio.entity.Project;

public interface ProjectsService {

	public List<Project> getAllProjects();
	   
	public void saveProjects(Project theProjects);

	public Project getProjects(int id);

	public void deleteProjects(int id);
}
