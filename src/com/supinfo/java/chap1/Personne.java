package com.supinfo.java.chap1;

import java.time.LocalDate;

public class Personne { 
	private int id;    
	private String prenom;    
	private String nom; 
	private LocalDate dateNaissance;   
	private String adresse; 
	private String telephone; 
	private String email; 
	
	
	// Constructeur explicite sans parametre 
	public Personne() {} 
	public Personne(int id, String prenom, String nom) 
	{ 
		this.id = id; 
		this.prenom = prenom; 
		this.nom = nom; 
	}
	
	public Personne(int id, String prenom, String nom,   
			LocalDate dateNaissance, String adresse, 
			String telephone, String email)  
	{  
		
		this(id, prenom, nom);  
		this.dateNaissance = dateNaissance;  
		this.adresse = adresse; 
		this.telephone = telephone; 
		this.email = email;   
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) { 
		this.email = email; 
	}   
	
	
	@Override
	public String toString() {
		return "Personne [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", dateNaissance=" + dateNaissance
				+ ", adresse=" + adresse + ", telephone=" + telephone + ", email=" + email + "]";
	}
	
	
}
