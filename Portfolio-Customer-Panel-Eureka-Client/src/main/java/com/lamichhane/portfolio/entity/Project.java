package com.lamichhane.portfolio.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_id_seq")
	@SequenceGenerator(name = "project_id_seq", 
	                   sequenceName = "project_seq",
	                   allocationSize = 1) 
	@Column(name="project_id")
	private int project_id;
	
	@Column(name="image_address")
	private String image_address;
	
	@Column(name="description")
	private String description;
	
	@Column(name = "title")
	private String  title;

	public String getImage_address() {
		return image_address;
	}

	public void setImage_address(String image_address) {
		this.image_address = image_address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getProject_id() {
		return project_id;
	}
	
	


}
