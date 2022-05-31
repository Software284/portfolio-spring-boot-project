package com.lamichhane.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.entity.Awards;
	
@Repository
public interface AwardsDAO extends JpaRepository<Awards,Integer>{

}
