package com.lamichhane.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.portfolio.dao.ContactMediumDAO;
import com.lamichhane.portfolio.entity.ContactMedium;
import com.lamichhane.portfolio.exception.classes.ContactMediumNotFoundException;

@Service
public class ContactMediumServiceImpl implements ContactMediumService{
	
	@Autowired
	private ContactMediumDAO contactMediumDAO;

	/* Specialize API Request Handling */
	
	@Override
	@Transactional
	public List<ContactMedium> getAllContactMedium() {
		
		return contactMediumDAO.findAll();
	}

	@Override
	@Transactional
	public void saveContactMedium(ContactMedium theContactMedium) {
		contactMediumDAO.save(theContactMedium);
	}

	@Override
	@Transactional
	public ContactMedium getContactMedium(int theId) {
		Optional<ContactMedium> contact_medium = contactMediumDAO.findById(theId);
		if(contact_medium.isEmpty()) {
			throw new ContactMediumNotFoundException("Contact Medium Not Found With Id-"+theId);
		}
		return contact_medium.get();
		
	}

	@Override
	@Transactional
	public void deleteContactMedium(int id) {
		contactMediumDAO.deleteById(id);
	}
	
}
