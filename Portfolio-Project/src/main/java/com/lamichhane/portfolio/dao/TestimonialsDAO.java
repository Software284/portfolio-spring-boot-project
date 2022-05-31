package com.lamichhane.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.entity.Testimonials;
	
@Repository
public interface TestimonialsDAO extends JpaRepository<Testimonials,Integer>{

}
