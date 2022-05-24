package com.lamichhane.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.entity.CreativeProcess;

@Repository
public interface CreativeProcessDAO extends JpaRepository<CreativeProcess,Integer>{

}
