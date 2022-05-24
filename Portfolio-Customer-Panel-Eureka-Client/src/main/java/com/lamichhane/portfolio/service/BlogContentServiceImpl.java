package com.lamichhane.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.portfolio.dao.BlogContentDAO;
import com.lamichhane.portfolio.entity.BlogContent;
import com.lamichhane.portfolio.entity.ContactDetail;
import com.lamichhane.portfolio.exception.classes.ContactDetailNotFoundException;

@Service
public class BlogContentServiceImpl implements BlogContentService{
	
	@Autowired
	private BlogContentDAO blogContentDAO;

	
	@Override
	@Transactional
	public List<BlogContent> getAllBlogContent() {
		
		return blogContentDAO.findAll();
	}

	@Override
	@Transactional
	public BlogContent saveBlogContent(BlogContent theBlogContent) {
		blogContentDAO.save(theBlogContent);
		return theBlogContent;
	}

	@Override
	@Transactional
	public BlogContent getBlogContent(int theId) {
		Optional<BlogContent> blog_content = blogContentDAO.findById(theId);
		if(blog_content.isEmpty()) {
			throw new ContactDetailNotFoundException("Contact Detail Not Found With Id-"+theId);
		}
		return blog_content.get();
		
	}

	@Override
	@Transactional
	public void deleteBlogContent(int id) {
		blogContentDAO.deleteById(id);
	}
	
}
