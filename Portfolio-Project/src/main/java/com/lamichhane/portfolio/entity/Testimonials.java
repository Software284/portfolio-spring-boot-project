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
@Table(name="testimonials")
public class Testimonials {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "testimonials_id_seq")
	@SequenceGenerator(name = "testimonials_id_seq", 
	                   sequenceName = "testimonials_seq",
	                   allocationSize = 1) 
	@Column(name="id")
	private int id;
	
	@Column(name="message")
	private String message;
	

	@Column(name = "image")
	private String  image;
	
	@Column(name="address")
	private String address;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}
	
	
	


	
}
