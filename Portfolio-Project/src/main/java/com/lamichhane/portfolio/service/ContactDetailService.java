package com.lamichhane.portfolio.service;

import java.util.List;

import com.lamichhane.portfolio.entity.ContactDetail;

public interface ContactDetailService {

	public List<ContactDetail> getAllContactDetail();
	   
	public void saveContactDetail(ContactDetail theContactDetail);

	public ContactDetail getContactDetail(int id);

	public void deleteContactDetail(int id);
}
