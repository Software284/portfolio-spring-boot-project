package com.lamichhane.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.portfolio.entity.ContactDetail;
	
@Repository
public interface ContactDetailDAO extends JpaRepository<ContactDetail,Integer>{

}
