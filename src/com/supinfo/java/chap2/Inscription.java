package com.supinfo.java.chap2;

import java.time.LocalDate;
import java.util.List;

import com.supinfo.java.chap4.Etudiant;

public class Inscription 
{ 
	private long id; 
	private LocalDate date; 
	private Niveau niveau;       
	private AnneeAcademique anneeAcademique;    
	private Filiere filiere;    
	private Etudiant etudiant; 
	

	public Inscription() {}
	
	public Inscription(long id, LocalDate date, AnneeAcademique anneeAcademique,
			Filiere filiere, Niveau niveau, Etudiant etudiant)  
	{
		this.id = id;
		this.date = date;    
		this.anneeAcademique = anneeAcademique;
		this.filiere = filiere; 
		this.niveau = niveau;
		this.etudiant = etudiant; 
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public AnneeAcademique getAnneeAcademique() {
		return anneeAcademique;
	}

	public void setAnneeAcademique(AnneeAcademique anneeAcademique) {
		this.anneeAcademique = anneeAcademique;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) { 
		this.etudiant = etudiant;
	}

	@Override
	public String toString() {
		return "Inscription [id=" + id + ", date=" + date + ", niveau=" 
	           + niveau.getDesignation() + ", anneeAcademique="
				+ anneeAcademique.getLibelle()
				  + ", filiere=" + filiere.getNom() +
				  ", etudiant=" + etudiant.getPrenom()
				  + " " + etudiant.getNom() + "]"; 
	}

	
	
	
	
	
	
	

}
