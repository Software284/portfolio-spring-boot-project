package com.lamichhane.portfolio.modal;

import java.util.List;

public class ProjectInformation {

	private int id;
	private String title;
	private String description;
	private List<String> imageurl;
	public ProjectInformation() {
	}
	public ProjectInformation(int id, String title, String description, List<String> imageurl) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.imageurl = imageurl;
	}
	@Override
	public String toString() {
		return "ProjectInformation [id=" + id + ", title=" + title + ", description=" + description + ", imageurl="
				+ imageurl + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getImageurl() {
		return imageurl;
	}
	public void setImageurl(List<String> imageurl) {
		this.imageurl = imageurl;
	}
	
	
	
	
}
