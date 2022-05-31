package com.lamichhane.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.entity.SkillProgressBar;
	
@Repository
public interface SkillProgressBarDAO extends JpaRepository<SkillProgressBar,Integer>{

}
