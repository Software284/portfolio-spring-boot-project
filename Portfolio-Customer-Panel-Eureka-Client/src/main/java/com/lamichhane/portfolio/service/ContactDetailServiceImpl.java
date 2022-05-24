package com.lamichhane.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.portfolio.dao.ContactDetailDAO;
import com.lamichhane.portfolio.entity.ContactDetail;
import com.lamichhane.portfolio.exception.classes.ContactDetailNotFoundException;

@Service
public class ContactDetailServiceImpl implements ContactDetailService{
	
	@Autowired
	private ContactDetailDAO contactDetailDAO;

	/* Specialize API Request Handling */
	
	@Override
	@Transactional
	public List<ContactDetail> getAllContactDetail() {
		
		return contactDetailDAO.findAll();
	}

	@Override
	@Transactional
	public void saveContactDetail(ContactDetail theContactDetail) {
		contactDetailDAO.save(theContactDetail);
	}

	@Override
	@Transactional
	public ContactDetail getContactDetail(int theId) {
		Optional<ContactDetail> contact_detail = contactDetailDAO.findById(theId);
		if(contact_detail.isEmpty()) {
			throw new ContactDetailNotFoundException("Contact Detail Not Found With Id-"+theId);
		}
		return contact_detail.get();
		
	}

	@Override
	@Transactional
	public void deleteContactDetail(int id) {
		contactDetailDAO.deleteById(id);
	}
	
}
