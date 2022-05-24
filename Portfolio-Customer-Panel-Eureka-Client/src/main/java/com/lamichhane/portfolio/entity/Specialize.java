package com.lamichhane.portfolio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="specialize")
public class Specialize {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "specialize_id_seq")
	@SequenceGenerator(name = "specialize_id_seq", 
	                   sequenceName = "specialize_seq",
	                   allocationSize = 1) 
	@Column(name="id")
	private int id;
	
	@Column(name="icon")
	private String icon;
	
	@Column(name="heading")
	private String heading;
	
	@Column(name="description")
	private String description;

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
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
