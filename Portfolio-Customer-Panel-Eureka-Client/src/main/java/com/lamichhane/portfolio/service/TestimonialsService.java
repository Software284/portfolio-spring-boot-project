package com.lamichhane.portfolio.service;

import java.util.List;

import com.lamichhane.portfolio.entity.Awards;
import com.lamichhane.portfolio.entity.Testimonials;

public interface TestimonialsService {

	public List<Testimonials> getAllTestimonials();
	   
	public void saveTestimonials(Testimonials theTestimonials);

	public Testimonials getTestimonials(int id);

	public void deleteTestimonials(int id);
}
