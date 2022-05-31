package com.lamichhane.portfolio.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lamichhane.portfolio.entity.Project;
import com.lamichhane.portfolio.service.ProjectsService;

@RestController
@RequestMapping("/portfolio")
public class ProjectController {
	
	@Autowired
	private ProjectsService projectsService;
	
	/* Projects description API  request processing */
	
	@GetMapping("/projects")
	public List<Project> getAllProjects() {
		return projectsService.getAllProjects();
	}
	
	@GetMapping("/projects/{projectsId}")
	public Project getProjects(@PathVariable int projectsId) {
		Project projects = projectsService.getProjects(projectsId);
		return projects;
	}
	
	
	@PostMapping("/projects")
	public ResponseEntity<Project> saveProjects(@RequestBody Project projects) throws IOException {
		projectsService.saveProjects(projects);
		return new ResponseEntity<>(projects,HttpStatus.CREATED);
	}
	
	@PutMapping("/projects")
	public Project updateProjects(@RequestBody Project projects) {
		projectsService.saveProjects(projects);
		return projects;
	}
	
	@DeleteMapping("/projects/{projectsId}")
	public String deleteProjects(@PathVariable int projectsId) {
		Project projects = projectsService.getProjects(projectsId);
		projectsService.deleteProjects(projectsId);
		
		return "Deleted Projects id is : "+projectsId;
	}

}
