package com.lamichhane.portfolio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="partners")
@Entity
public class Partners {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "partners_id_seq")
	@SequenceGenerator(name = "partners_id_seq", 
	                   sequenceName = "partners_seq",
	                   allocationSize = 1) 
	@Column(name="id")
	private int id;
	
	@Column(name="url")
	private String url;

	

	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public int getId() {
		return id;
	}
	
	

}
