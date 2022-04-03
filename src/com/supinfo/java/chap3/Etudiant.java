package com.supinfo.java.chap3;

import java.time.LocalDate;
import java.util.List;

public class Etudiant extends Personne  
{
	private String matricule; 
	private List<ContactEtudiant> contactEtudiant; 
	
	public Etudiant()      
	{
		// appel du constructeur explicite sans parametre
		// de la Classe Personne
		super(); 
	} 
	
	public Etudiant(int id, String prenom, String nom,   
			LocalDate dateNaissance, String adresse, 
			String telephone, String email, String lieuNaissance, 
			String nationalite, String genre,
			String matricule) 
	
	{ 
		super( id, prenom,  nom,    
			 dateNaissance,  adresse, 
			 telephone, email, lieuNaissance, nationalite, genre); 
		this.matricule = matricule; 
		
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public List<ContactEtudiant> getContactEtudiant() {
		return contactEtudiant;
	}

	public void setContactEtudiant(List<ContactEtudiant> contactEtudiant) {
		this.contactEtudiant = contactEtudiant;
	}

	@Override
	public String toString() {
		return super.toString() + ", matricule=" + matricule + "]"; 
	} 
	
	

}
