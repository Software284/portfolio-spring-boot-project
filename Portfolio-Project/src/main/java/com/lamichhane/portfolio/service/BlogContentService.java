package com.lamichhane.portfolio.service;

import java.util.List;

import com.lamichhane.portfolio.entity.Awards;
import com.lamichhane.portfolio.entity.BlogContent;
public interface BlogContentService {

	public List<BlogContent> getAllBlogContent();
	   
	public BlogContent saveBlogContent(BlogContent theBlogContent);

	public BlogContent getBlogContent(int id);

	public void deleteBlogContent(int id);
}
