package com.lamichhane.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.portfolio.dao.TestimonialsDAO;
import com.lamichhane.portfolio.entity.Testimonials;
import com.lamichhane.portfolio.exception.classes.TestimonialsNotFoundException;

@Service
public class TestimonialsServiceImpl implements TestimonialsService{
	
	
	@Autowired
	private TestimonialsDAO testimonialsDAO;

	/* Specialize API Request Handling */
	
	@Override
	@Transactional
	public List<Testimonials> getAllTestimonials() {
		
		return testimonialsDAO.findAll();
	}

	@Override
	@Transactional
	public void saveTestimonials(Testimonials theTestimonials) {
		testimonialsDAO.save(theTestimonials);
	}

	@Override
	@Transactional
	public Testimonials getTestimonials(int theId) {
		Optional<Testimonials> testi = testimonialsDAO.findById(theId);
		if(testi.isEmpty()) {
			throw new TestimonialsNotFoundException("Testimonials Not Found With Id-"+theId);
		}
		return testi.get();
		
	}

	@Override
	@Transactional
	public void deleteTestimonials(int id) {
		testimonialsDAO.deleteById(id);
	}
	
}
