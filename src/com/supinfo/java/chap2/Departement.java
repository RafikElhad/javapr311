package com.supinfo.java.chap2;

import java.util.List;

/*
 * 
 * cette classe represente un département    
 * Jeudi 24/30/2022   
 */

 
public class Departement   
{ 
	private long id; 
	private String nom;  
	private String description;  
	private static int compteur = 0;     
	private List<Filiere> filiere;  
	
	public Departement() 
	{ 
		Departement.compteur++;
		this.id = Departement.compteur; 
		
	}  
	
	public Departement(String nom, String description) 
	{
		this.nom  = nom; 
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
	
	public static int getCompteur()      
	{
		return  Departement.compteur;  
	} 
	
	

	public List<Filiere> getFiliere() {      
		return filiere;
	}

	public void setFiliere(List<Filiere> filiere) {    
		this.filiere = filiere;
	}

	@Override
	public String toString() {
		return "Departement [id=" + id + ", nom=" + nom + ", description=" + description + "]";
	} 
	
	

}
