package com.supinfo.java.chap2;

import java.util.List;

/*
 * 
 * Cette classe represente un filiere   
 */

public class Filiere 
{ 
	private long id; 
	private String nom;  
	private String description;  
	private static int compteur = 0; 
	private Departement departement;     
	private Inscription inscription;    
	
	     
	
	public Filiere() 
	{
		Filiere.compteur++; 
		this.id = Filiere.compteur;
	} 
	
	public Filiere(String nom, String description)   
	{
		this();             
		this.nom = nom; 
		this.description = description;         
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) { 
		this.description = description; 
	}

	public long getId() {   
		return id;
	}

	public Departement getDepartement() {    
		return departement; 
	}

	public void setDepartement(Departement departement) {        
		this.departement = departement;
	}
	
	public static int getCompteur()      
	{
		return  Filiere.compteur;  
	}  
	
	

	public Inscription getInscription() {
		return inscription;
	}

	public void setInscription(Inscription inscription) { 
		this.inscription = inscription;
	}

	@Override
	public String toString() {
		return "Filiere [id=" + id + ", nom=" + nom + ", description=" + description + ", departement=" + departement
				+ ", inscription=" + inscription + "]";
	}

	
	
	
	

}
