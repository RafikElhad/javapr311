package com.supinfo.java.chap1;

public class Module { 
	
	private int id; 
	private String nom; 
	private String description; 
	private int volumeHoraire; 
	private int coefficient;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getVolumeHoraire() {
		return volumeHoraire;
	}
	public void setVolumeHoraire(int volumeHoraire) {
		this.volumeHoraire = volumeHoraire;
	}
	public int getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}  
	
	
	
	
	@Override
	public String toString() {
		return "Module [id=" + id + ", nom=" + nom + ", description=" + description + ", volumeHoraire=" + volumeHoraire
				+ ", coefficient=" + coefficient + "]";
	}
	public static void main(String [] args)  
	{
		Module module1 = new Module(); 
		Module module2 = new Module(); 
		
		module1.setId(1); 
		module1.setNom("Java");  
		module1.setDescription("java programmation oriente object"); 
		module1.setVolumeHoraire(20); 
		module1.setCoefficient(5);  
		
		module2.setId(2); 
		module2.setNom("Php");  
		module2.setDescription("Php Securite");  
		module2.setVolumeHoraire(20); 
		module2.setCoefficient(4);  
		
		System.out.println(module1); 
		System.out.println(module2);     
		
	}

}
