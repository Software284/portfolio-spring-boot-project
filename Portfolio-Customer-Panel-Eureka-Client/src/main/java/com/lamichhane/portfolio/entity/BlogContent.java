package com.lamichhane.portfolio.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="blog_content")
public class BlogContent {
	
//	https://www.techgeeknext.com/spring-boot/spring-boot-upload-image
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "blog_id_seq")
	@SequenceGenerator(name = "blog_id_seq", 
	                   sequenceName = "blog_seq",
	                   allocationSize = 1) 
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	

	@Column(name = "image")
	private String  image;
	
	@Column(name="blogdate")
	private Date blogdate;
	
	@Column(name="location")
	private String location;
	
	@Column(name="description")
	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getDate() {
		return blogdate;
	}

	public void setDate(Date blogdate) {
		this.blogdate = blogdate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}
	
	
	
	
	


	
	
	
	
	
}
