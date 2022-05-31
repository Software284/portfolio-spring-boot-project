package com.lamichhane.portfolio.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lamichhane.portfolio.entity.BlogContent;
import com.lamichhane.portfolio.service.BlogContentService;

@RestController
@RequestMapping("/portfolio")
public class BlogContentController {
	
	@Autowired
	private BlogContentService blogContentService;
	
	
	/* BlogContent API request processing */
	
	@GetMapping("/blog_content")
	public List<BlogContent> getAllBlogContent() {
		return blogContentService.getAllBlogContent();
	}
	
	@GetMapping("/blog_content/{blogcontentId}")
	public BlogContent getBlogContent(@PathVariable int blogcontentId) {
		BlogContent blog_content = blogContentService.getBlogContent(blogcontentId);
		return blog_content;
	}
	
	
	@PostMapping("/blog_content")
	public ResponseEntity<BlogContent> saveBlogContent(@RequestBody BlogContent blogcontent) throws IOException {
		BlogContent content = blogContentService.saveBlogContent(blogcontent);

		return new ResponseEntity<>(blogcontent,HttpStatus.CREATED);
	}
	
	@PutMapping("/blog_content")
	public BlogContent updateBlogContent(@RequestBody BlogContent blogcontent) {
		blogContentService.saveBlogContent(blogcontent);
		return blogcontent;
	}
	
	@DeleteMapping("/blog_content/{blogcontentId}")
	public String deleteBlogContent(@PathVariable int blogcontentId) {
		BlogContent blog_content = blogContentService.getBlogContent(blogcontentId);
		blogContentService.deleteBlogContent(blogcontentId);
		
		return "Deleted blog content id is : "+blogcontentId;
	}
	

}
