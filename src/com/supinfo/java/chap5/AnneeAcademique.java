package com.supinfo.java.chap5;

import java.util.List;

public class AnneeAcademique 
{ 
	
	private long id; 
	private String libelle;  
	private String description;  
	
	
	
	public AnneeAcademique() {}
	
	public AnneeAcademique(long id, String libelle, String description)      
	{   
		 
		this.id = id;
		this.libelle = libelle; 
		this.description = description;       
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id; 
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) { 
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AnneeAcademique [id=" + id + ", libelle=" + libelle + ", description=" + description + "]";
	}
	
	
	
	

	
	

	
	
	
	
 
}
