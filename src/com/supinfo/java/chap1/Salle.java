package com.supinfo.java.chap1;

public class Salle { 
	
	private int id; 
	private String nom; 
	private String localisation; 
	private String capacite;
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
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public String getCapacite() {
		return capacite;
	}
	public void setCapacite(String capacite) {
		this.capacite = capacite;
	} 
	
	
	
	@Override
	public String toString() {
		return "Salle [id=" + id + ", nom=" + nom + ", localisation=" + localisation + ", capacite=" + capacite + "]";
	} 
	
	public static void main(String [] args) 
	{
		Salle salle1 = new Salle(); 
		Salle salle2 = new Salle();   
		
		salle1.setId(1); 
		salle1.setNom("Network"); 
		salle1.setCapacite("20 places "); 
		salle1.setLocalisation("localisation c'est rue 22 angle 14 "); 
		
		salle2.setId(2); 
		salle2.setNom("Centrino"); 
		salle2.setCapacite("40 places "); 
		salle2.setLocalisation("localisation c'est rue 22 angle 16 ");  
		
		System.out.println(salle1); 
		System.out.println(salle2);   
	}

}
