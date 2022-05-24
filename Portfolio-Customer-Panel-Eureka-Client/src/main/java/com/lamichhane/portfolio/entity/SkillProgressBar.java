package com.lamichhane.portfolio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="skill_info")
public class SkillProgressBar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "skill_id_seq")
	@SequenceGenerator(name = "skill_id_seq", 
	                   sequenceName = "skill_seq",
	                   allocationSize = 1) 
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="percent")
	private int percent;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public int getId() {
		return id;
	}
	
	
	
}
