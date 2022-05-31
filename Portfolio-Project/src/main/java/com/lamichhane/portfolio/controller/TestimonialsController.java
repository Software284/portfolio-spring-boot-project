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

import com.lamichhane.portfolio.entity.Testimonials;
import com.lamichhane.portfolio.service.TestimonialsService;

@RestController
@RequestMapping("/portfolio")
public class TestimonialsController {
	
	@Autowired
	private TestimonialsService testimonialsService;
	
	/* Testimonials API  request processing */
	
	@GetMapping("/testimonial")
	public List<Testimonials> getAllTestimonial() {
		return testimonialsService.getAllTestimonials();
	}
	
	@GetMapping("/testimonial/{testimonialId}")
	public Testimonials getTestimonials(@PathVariable int testimonialId) {
		Testimonials testimonial = testimonialsService.getTestimonials(testimonialId);
		return testimonial;
	}
	
	
	@PostMapping("/testimonial")
	public ResponseEntity<Testimonials> saveTestimonials(@RequestBody Testimonials testimonials) throws IOException {
		testimonialsService.saveTestimonials(testimonials);
		return new ResponseEntity<>(testimonials,HttpStatus.CREATED);
	}
	
	@PutMapping("/testimonial")
	public Testimonials updateTestimonials(@RequestBody Testimonials testimonials) {
		testimonialsService.saveTestimonials(testimonials);
		return testimonials;
	}
	
	@DeleteMapping("/testimonial/{testimonialId}")
	public String deleteTestimonials(@PathVariable int testimonialId) {
		Testimonials testimonials = testimonialsService.getTestimonials(testimonialId);
		testimonialsService.deleteTestimonials(testimonialId);
		
		return "Deleted Testimonials id is : "+testimonialId;
	}
	


}
