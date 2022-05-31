package com.lamichhane.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.entity.BlogContent;
	
@Repository
public interface BlogContentDAO extends JpaRepository<BlogContent,Integer>{

}
