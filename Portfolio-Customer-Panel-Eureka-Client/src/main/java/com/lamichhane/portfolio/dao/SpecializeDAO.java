package com.lamichhane.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.entity.Specialize;
	
@Repository
public interface SpecializeDAO extends JpaRepository<Specialize,Integer>{

}
