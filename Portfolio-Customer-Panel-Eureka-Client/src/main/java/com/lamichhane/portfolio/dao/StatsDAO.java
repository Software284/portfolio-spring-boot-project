package com.lamichhane.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.entity.Stats;

@Repository
public interface StatsDAO extends JpaRepository<Stats,Integer>{

}
