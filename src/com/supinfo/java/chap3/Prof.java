package com.supinfo.java.chap3;

import java.time.LocalDate;

public class Prof extends Personne 
{
	private String specialite; 
	
	public Prof() 
	{
		super(); 
	}
	
	public Prof(int id, String prenom, String nom,   
			LocalDate dateNaissance, String adresse, 
			String telephone, String email, String lieuNaissance, 
			String nationalite, String genre, String specialite)
	{ 
		super( id, prenom,  nom,   
				 dateNaissance,  adresse, 
				 telephone, email,lieuNaissance, nationalite, genre);   
		this.specialite = specialite;  
		
	}

	public String getSpecialite() { 
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return super.toString() + ", specialite=" + specialite + "]"; 
	}
	
    
}
