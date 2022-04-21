package com.supinfo.java.chap2;

import java.util.List;

public class Niveau 
{  
	
	private long id; 
	private String designation;
	
	   
	
	public Niveau() {}
	
	public Niveau(long id, String designation)   
	{
		this.id = id;  
		this.designation = designation; 
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Niveau [id=" + id + ", designation=" + designation + "]";
	}

	
	
	
	
	

}
