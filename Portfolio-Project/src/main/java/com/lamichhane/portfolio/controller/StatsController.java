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

import com.lamichhane.portfolio.entity.Stats;
import com.lamichhane.portfolio.service.StatsService;

@RestController
@RequestMapping("/portfolio")
public class StatsController {
	
	@Autowired
	private StatsService statsService;
	
	
	/* Stats API request processing */
	
	@GetMapping("/stats")
	public List<Stats> getAllStats() {
		return statsService.getAllStats();
	}
	
	@GetMapping("/stats/{statsId}")
	public Stats getStats(@PathVariable int statsId) {
		Stats stats = statsService.getStats(statsId);
		return stats;
	}
	
	
	@PostMapping("/stats")
	public ResponseEntity<Stats> saveStats(@RequestBody Stats sts) {
		statsService.saveStats(sts);
		return new ResponseEntity<>(sts,HttpStatus.CREATED);
	}
	
	@PutMapping("/stats")
	public Stats updateStats(@RequestBody Stats sts) {
		statsService.saveStats(sts);
		return sts;
	}
	
	@DeleteMapping("/stats/{statsId}")
	public String deleteStats(@PathVariable int statsId) {
		Stats spe = statsService.getStats(statsId);
		statsService.deleteStats(statsId);
		
		return "Deleted Stats id is : "+statsId;
	}

}
