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

import com.lamichhane.portfolio.entity.ContactDetail;
import com.lamichhane.portfolio.service.ContactDetailService;

@RestController
@RequestMapping("/portfolio")
public class ContactDetailsController {
	
	@Autowired
	private ContactDetailService contactDetailService;
	
/* ContactDetail API request processing */
	
	@GetMapping("/contact_detail")
	public List<ContactDetail> getAllContactDetail() {
		return contactDetailService.getAllContactDetail();
	}
	
	@GetMapping("/contact_detail/{contactdetailId}")
	public ContactDetail getContactDetail(@PathVariable int contactdetailId) {
		ContactDetail contact_detail = contactDetailService.getContactDetail(contactdetailId);
		return contact_detail;
	}
	
	
	@PostMapping("/contact_detail")
	public ResponseEntity<ContactDetail> saveContactDetail(@RequestBody ContactDetail contactdetail) {
		contactDetailService.saveContactDetail(contactdetail);
		return new ResponseEntity<>(contactdetail,HttpStatus.CREATED);
	}
	
	@PutMapping("/contact_detail")
	public ContactDetail updateContactDetail(@RequestBody ContactDetail contactdetail) {
		contactDetailService.saveContactDetail(contactdetail);
		return contactdetail;
	}
	
	@DeleteMapping("/contact_detail/{contactdetailId}")
	public String deleteContactDetail(@PathVariable int contactdetailId) {
		ContactDetail contact_detail = contactDetailService.getContactDetail(contactdetailId);
		contactDetailService.deleteContactDetail(contactdetailId);
		
		return "Deleted Knowldge Resume id is : "+contactdetailId;
	}
	

}
