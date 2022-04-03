package com.supinfo.java.chap2;

import java.time.LocalDate;
import java.util.List;

public class Inscription 
{ 
	private long id; 
	private LocalDate date; 
	public static int compteur = 0;      
	private List<AnneeAcademique> anneeAcademique;   
	private List<Niveau> niveau;  
	private List<Filiere> filiere;  
	
	public Inscription() 
	{ 
		
		Inscription.compteur++;
		this.id = Inscription.compteur;      
		
	}
	
	public Inscription(LocalDate date)
	{
		this.date = date;    
	}

	public LocalDate getDate() {
		return date;
	}
 
	public void setDate(LocalDate date) {    
		this.date = date;
	}

	public long getId() {
		return id;
	} 
	
	
	public static int getCompteur()      
	{
		return  Inscription.compteur;    
	} 
	

	public static void setCompteur(int compteur) {
		Inscription.compteur = compteur;
	}

	public List<AnneeAcademique> getAnneeAcademique() {
		return anneeAcademique;
	}

	public void setAnneeAcademique(List<AnneeAcademique> anneeAcademique) {
		this.anneeAcademique = anneeAcademique;
	}
 
	public List<Niveau> getNiveau() {
		return niveau;
	}

	public void setNiveau(List<Niveau> niveau) {  
		this.niveau = niveau;
	}

	public List<Filiere> getFiliere() {
		return filiere;
	}

	public void setFiliere(List<Filiere> filiere) {
		this.filiere = filiere;
	}

	@Override
	public String toString() { 
		return "Inscription [id=" + id + ", date=" + date + ", anneeAcademique=" + anneeAcademique + ", niveau="
				+ niveau + ", filiere=" + filiere + "]";
	}

	
	
	
	

}
