package com.lamichhane.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.entity.Project;
@Repository
public interface ProjectsDAO extends JpaRepository<Project,Integer>{

}
