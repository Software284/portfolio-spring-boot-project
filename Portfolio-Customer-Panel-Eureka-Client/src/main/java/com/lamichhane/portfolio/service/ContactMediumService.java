package com.lamichhane.portfolio.service;

import java.util.List;

import com.lamichhane.portfolio.entity.ContactMedium;

public interface ContactMediumService {

	public List<ContactMedium> getAllContactMedium();
	   
	public void saveContactMedium(ContactMedium theContactMedium);

	public ContactMedium getContactMedium(int id);

	public void deleteContactMedium(int id);
}
