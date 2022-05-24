package com.lamichhane.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.entity.ContactMedium;
	
@Repository
public interface ContactMediumDAO extends JpaRepository<ContactMedium,Integer>{
	
}
