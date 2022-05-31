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

import com.lamichhane.portfolio.entity.Awards;
import com.lamichhane.portfolio.service.AwardsService;

@RestController
@RequestMapping("/portfolio")
public class AwardsController {
	
	@Autowired
	private AwardsService awardsService;
	
	/* Awards API request processing */
	
	@GetMapping("/awards")
	public List<Awards> getAllAwards() {
		return awardsService.getAllAwards();
	}
	
	@GetMapping("/awards/{awardsId}")
	public Awards getAwards(@PathVariable int awardsId) {
		Awards awards = awardsService.getAwards(awardsId);
		return awards;
	}
	
	
	@PostMapping("/awards")
	public ResponseEntity<Awards> saveAwards(@RequestBody Awards awards) {
		awardsService.saveAwards(awards);
		return new ResponseEntity<>(awards,HttpStatus.CREATED);
	}
	
	@PutMapping("/awards")
	public Awards updateAwards(@RequestBody Awards awards) {
		awardsService.saveAwards(awards);
		return awards;
	}
	
	@DeleteMapping("/awards/{awardsId}")
	public String deleteAwards(@PathVariable int awardsId) {
		Awards awards = awardsService.getAwards(awardsId);
		awardsService.deleteAwards(awardsId);
		
		return "Deleted awards  id is : "+awardsId;
	}

}
