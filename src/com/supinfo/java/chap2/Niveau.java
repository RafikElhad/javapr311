package com.supinfo.java.chap2;

import java.util.List;

public class Niveau 
{  
	
	private long id; 
	private String designation;
	private Inscription inscription; 
	public static int compteur = 0; 
	   
	
	public Niveau() 
	{  
	    
		Niveau.compteur++;
		this.id = Niveau.compteur;  
		
	} 
	
	public Niveau(String designation) 
	{
		this(); 
		this.designation = designation; 
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getId() { 
		return id;
	}   
	
	public static int getCompteur()      
	{
		return  Niveau.compteur; 
	}

	public Inscription getInscription() {
		return inscription;
	}

	public void setInscription(Inscription inscription) {  
		this.inscription = inscription;
	}

	@Override
	public String toString() {
		return "Niveau [id=" + id + ", designation=" + designation + ", inscription=" + inscription + "]";
	}
 
	
	
	
	

}
