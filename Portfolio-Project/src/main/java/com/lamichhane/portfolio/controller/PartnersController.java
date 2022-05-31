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

import com.lamichhane.portfolio.entity.Partners;
import com.lamichhane.portfolio.service.PartnersService;

@RestController
@RequestMapping("/portfolio")
public class PartnersController {
	
	@Autowired
	private PartnersService partnersService;
	
	
/* Partners API  request processing */
	
	@GetMapping("/partners")
	public List<Partners> getAllPartners() {
		return partnersService.getAllPartners();
	}
	
	@GetMapping("/partners/{partnersId}")
	public Partners getPartners(@PathVariable int partnersId) {
		Partners partners = partnersService.getPartners(partnersId);
		return partners;
	}
	
	
	@PostMapping("/partners")
	public ResponseEntity<Partners> savePartners(@RequestBody Partners partners) throws IOException {
		partnersService.savePartners(partners);
		return new ResponseEntity<>(partners,HttpStatus.CREATED);
	}
	
	@PutMapping("/partners")
	public Partners updatePartners(@RequestBody Partners partners) {
		partnersService.savePartners(partners);
		return partners;
	}
	
	@DeleteMapping("/partners/{partnersId}")
	public String deletePartners(@PathVariable int partnersId) {
		Partners partners = partnersService.getPartners(partnersId);
		partnersService.deletePartners(partnersId);
		
		return "Deleted partners id is : "+partnersId;
	}

}
