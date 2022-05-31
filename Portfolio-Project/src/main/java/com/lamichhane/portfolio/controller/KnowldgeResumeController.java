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

import com.lamichhane.portfolio.entity.KnowldgeResume;
import com.lamichhane.portfolio.service.KnowldgeResumeService;

@RestController
@RequestMapping("/portfolio")
public class KnowldgeResumeController {
	
	@Autowired
	private KnowldgeResumeService knowldgeResumeService;
	
/* Knowldge Resume API request processing */
	
	@GetMapping("/knowldge_resume")
	public List<KnowldgeResume> getAllKnowldgeResume() {
		return knowldgeResumeService.getAllKnowldgeResume();
	}
	
	@GetMapping("/knowldge_resume/{knowldgeresumeId}")
	public KnowldgeResume getKnowldgeResume(@PathVariable int knowldgeresumeId) {
		KnowldgeResume knowldge_resume = knowldgeResumeService.getKnowldgeResume(knowldgeresumeId);
		return knowldge_resume;
	}
	
	
	@PostMapping("/knowldge_resume")
	public ResponseEntity<KnowldgeResume> saveKnowldgeResume(@RequestBody KnowldgeResume knowldgeresume) {
		knowldgeResumeService.saveKnowldgeResume(knowldgeresume);
		return new ResponseEntity<>(knowldgeresume,HttpStatus.CREATED);
	}
	
	@PutMapping("/knowldge_resume")
	public KnowldgeResume updateKnowldgeResume(@RequestBody KnowldgeResume knowldgeresume) {
		knowldgeResumeService.saveKnowldgeResume(knowldgeresume);
		return knowldgeresume;
	}
	
	@DeleteMapping("/knowldge_resume/{knowldgeresumeId}")
	public String deleteKnowldgeResume(@PathVariable int knowldgeresumeId) {
		KnowldgeResume knowldgeresume = knowldgeResumeService.getKnowldgeResume(knowldgeresumeId);
		knowldgeResumeService.deleteKnowldgeResume(knowldgeresumeId);
		
		return "Deleted Knowldge Resume id is : "+knowldgeresumeId;
	}
	

}
