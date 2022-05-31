package com.lamichhane.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.entity.Partners;
	
@Repository
public interface PartnersDAO extends JpaRepository<Partners,Integer>{

}
