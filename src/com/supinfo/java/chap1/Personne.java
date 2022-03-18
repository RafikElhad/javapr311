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
	public static void main(String [] args)  
	{
		Personne personne1 = new Personne();  
		Personne personne2 = new Personne();   
		
		LocalDate dateNaissance = LocalDate.parse("2000-05-25");  
		LocalDate dateNaissance2 = LocalDate.parse("2005-02-22");      
		personne1.setId(1);  
		personne1.setPrenom("Rafik");   
		personne1.setNom("Elhad"); 
		personne1.setAdresse("Moroni");  
		personne1.setDateNaissance(dateNaissance);  
		personne1.setTelephone("77 262 57 42"); 
		personne1.setEmail("rafik.elhad269@gmail.com");  
		
		personne2.setId(2);
		personne2.setPrenom("Fatima");   
		personne2.setNom("Mohamed Abdou"); 
		personne2.setAdresse("Magoudjou");  
		personne2.setDateNaissance(dateNaissance2);  
		personne2.setTelephone("77 262 57 55"); 
		personne2.setEmail("fatima.mohamed269@gmail.com");   
		
		System.out.println(personne1); 
		System.out.println(personne2);   
	}

}
