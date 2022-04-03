package com.supinfo.java.chap4;

import com.supinfo.java.chap2.Filiere;

public abstract class CompteBancaire   
{ 
	private int id; 
	private int numero; 
	private float solde; 
	private String nom; 
	private String prenom;  

	// contructeur explicite sans parametre  
	
	
	public CompteBancaire() {
		
		System.out.println("Creation d'une nouvelle compte bancaire"); 
	}  
	
	public CompteBancaire(int id, int numero, float solde,   
			String nom, String prenom) 
	
	{
		this.id = id; 
		this.numero = numero;
		this.solde = solde;
		this.nom = nom; 
		this.prenom = prenom; 
	} 
	
	public void debiter(float montant)  
	{
		solde = solde + montant; 
	}
	
	public void crediter(float montant) 
	{
		solde-=montant;  
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) { 
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {  
		this.prenom = prenom;
	}

	@Override
	public String toString() {   
		return " [id=" + id + ", numero=" + numero + ", solde=" + solde + ", nom=" + nom + ", prenom="
				+ prenom; 
	}

	public abstract String getNomComplet(); 
	
	
	 
	
	
	
	
	
	
 
}
