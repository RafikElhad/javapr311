package com.supinfo.java.chap4;

import java.time.LocalDate;

public abstract class Personne 
{ 
	private int id;    
	private String prenom;    
	private String nom; 
	private LocalDate dateNaissance;   
	private String adresse; 
	private String telephone; 
	private String email;  
	private String lieuNaissance; 
	private String nationalite;        
	private String genre; 
	
	
	
	// Constructeur explicite sans parametre 
	public Personne() {} 
	
	public Personne(int id, String prenom, String nom,   
			LocalDate dateNaissance, String adresse, 
			String telephone, String email, String lieuNaissance, 
			String nationalite, String genre)   
	{  
		
		this.id = id;  
		this.prenom = prenom; 
		this.nom = nom; 
		this.dateNaissance = dateNaissance;  
		this.adresse = adresse; 
		this.telephone = telephone; 
		this.email = email;    
		this.lieuNaissance = lieuNaissance; 
		this.nationalite = nationalite; 
		this.genre = genre; 
		
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
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	} 
	
	public abstract String getNomComplet();
	
	@Override
	public String toString() { 
		return " [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", dateNaissance=" + dateNaissance
				+ ", adresse=" + adresse + ", telephone=" + telephone + ", email=" + email + ", lieuNaissance="
				+ lieuNaissance + ", nationalite=" + nationalite + ", genre=" + genre; 
	}    
	
	
	
	
	
}
