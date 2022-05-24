package com.lamichhane.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.entity.KnowldgeResume;
	
@Repository
public interface KnowldgeResumeDAO extends JpaRepository<KnowldgeResume,Integer>{

}
