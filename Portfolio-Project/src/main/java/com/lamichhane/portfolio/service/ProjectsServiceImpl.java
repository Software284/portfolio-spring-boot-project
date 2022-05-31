package com.lamichhane.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.portfolio.dao.ProjectsDAO;
import com.lamichhane.portfolio.entity.Project;
import com.lamichhane.portfolio.exception.classes.ProjectsNotFoundException;


@Service
public class ProjectsServiceImpl implements ProjectsService{
	
	@Autowired
	private ProjectsDAO projectsDAO;
	

	
	@Override
	@Transactional
	public List<Project> getAllProjects() {
		
		return projectsDAO.findAll();
	}

	@Override
	@Transactional
	public void saveProjects(Project theProjects) {
		projectsDAO.save(theProjects);
	}

	@Override
	@Transactional
	public Project getProjects(int theId) {
		Optional<Project> projects = projectsDAO.findById(theId);
		if(projects.isEmpty()) {
			throw new ProjectsNotFoundException("Project Not Found With Id-"+theId);
		}
		return projects.get();
		
	}

	@Override
	@Transactional
	public void deleteProjects(int id) {
		projectsDAO.deleteById(id);
	}
	
}
