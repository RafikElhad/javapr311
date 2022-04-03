package com.supinfo.java.chap1;

import java.time.LocalDate;

public class Groupe { 
	
	private int id; 
	private String nom;  
	private LocalDate dateCreation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public LocalDate getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}    
	
	
	
	@Override
	public String toString() {
		return "Groupe [id=" + id + ", nom=" + nom + ", dateCreation=" + dateCreation + "]";
	}
	public static void main(String [] args )  
	{ 
		Groupe groupe1 = new Groupe(); 
		Groupe groupe2 = new Groupe();  
		
		LocalDate dateCreation = LocalDate.parse("2022-03-18"); 
		LocalDate dateCreation2 = LocalDate.parse("2022-03-19"); 
		
		groupe1.setId(1); 
		groupe1.setNom("PR311"); 
		groupe1.setDateCreation(dateCreation); 
		
		groupe2.setId(2); 
		groupe2.setNom("PR312"); 
		groupe2.setDateCreation(dateCreation);  
		
		System.out.println(groupe1); 
		System.out.println(groupe2); 
		
		
		
	}
	

} 
