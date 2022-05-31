package com.lamichhane.portfolio.controller;

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

import com.lamichhane.portfolio.entity.SkillProgressBar;
import com.lamichhane.portfolio.service.SkillProgressBarService;

@RestController
@RequestMapping("/portfolio")
public class SkillProgressBarController {
	
	@Autowired
	private SkillProgressBarService skillProgressBarService;
	
/* SkillProgressBar API request processing */
	
	@GetMapping("/skill_progressbar")
	public List<SkillProgressBar> getAllSkillProgressBar() {
		return skillProgressBarService.getAllSkillProgressBar();
	}
	
	@GetMapping("/skill_progressbar/{skillprogressbarId}")
	public SkillProgressBar getSkillProgressbar(@PathVariable int skillprogressbarId) {
		SkillProgressBar skill_progressbar = skillProgressBarService.getSkillProgressBar(skillprogressbarId);
		return skill_progressbar;
	}
	
	
	@PostMapping("/skill_progressbar")
	public ResponseEntity<SkillProgressBar> saveSkillProgressBar(@RequestBody SkillProgressBar skillprogressbar) {
		skillProgressBarService.saveSkillProgressBar(skillprogressbar);
		return new ResponseEntity<>(skillprogressbar,HttpStatus.CREATED);
	}
	
	@PutMapping("/skill_progressbar")
	public SkillProgressBar updateSkillProgressBar(@RequestBody SkillProgressBar skillprogressbar) {
		skillProgressBarService.saveSkillProgressBar(skillprogressbar);
		return skillprogressbar;
	}
	
	@DeleteMapping("/skill_progressbar/{skillprogressbarId}")
	public String deleteSkillProgressBar(@PathVariable int skillprogressbarId) {
		SkillProgressBar skill_progressbar = skillProgressBarService.getSkillProgressBar(skillprogressbarId);
		skillProgressBarService.deleteSkillProgressBar(skillprogressbarId);
		
		return "Deleted skill progressbar id is : "+skillprogressbarId;
	}
	

}
