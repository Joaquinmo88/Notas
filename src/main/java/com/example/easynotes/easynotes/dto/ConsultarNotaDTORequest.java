package com.example.easynotes.easynotes.dto;

import java.io.Serializable;

public class ConsultarNotaDTORequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private Long id;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
}
