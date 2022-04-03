package com.supinfo.java.chap4;

import java.util.List;

public class CompteCourant extends CompteBancaire
{
	private double decouvertMax;  
	private List<CompteCourant> CompteCourant;   
	
	public void fixerDecouvertMaximal(float montant)  
	{
		this.decouvertMax = montant ;
	} 
  
	public CompteCourant()
	{
		// Appel du constructeur explicite sans parametre  
		// de la classe CompteBancaire
		
		super();  
	}  
	
	public CompteCourant(int id, int numero, float solde,  
			String nom, String prenom, double decouvertMax)   
	
	{
		super(id, numero, solde,  
			 nom, prenom); 
		this.decouvertMax = decouvertMax;   
		 
	}   
	
	public void retirer(float montant, float solde )  
	{
		solde = solde-montant;
	}

	public double getDecouvertMax() {
		return decouvertMax;
	}

	public void setDecouvertMax(double decouvertMax) {
		this.decouvertMax = decouvertMax; 
	} 
	
	

	public List<CompteCourant> getCompteCourant() {
		return CompteCourant;
	}

	public void setCompteCourant(List<CompteCourant> compteCourant) { 
		CompteCourant = compteCourant;
	}

	@Override
	public String toString() {
		return super.toString() + ", [decouvertMax=" + decouvertMax + "]"; 
	}

	@Override
	public String getNomComplet() { 
		
		return "CompteCourant: " + super.getPrenom()+ "  " + super.getNom();
	} 
	
	
	
	
	
	
	
	
}
