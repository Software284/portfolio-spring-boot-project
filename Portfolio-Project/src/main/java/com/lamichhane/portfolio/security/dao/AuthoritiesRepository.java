package com.lamichhane.portfolio.security.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.security.entity.AuthoritiesEntity;

@Repository
public interface AuthoritiesRepository extends CrudRepository<AuthoritiesEntity, Integer> {

    Set<AuthoritiesEntity> findByRole(String role);
}