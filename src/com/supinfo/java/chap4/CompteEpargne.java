package com.supinfo.java.chap4;

import java.util.List;

public class CompteEpargne extends CompteBancaire 
{ 
	private float tauxInteret = 0;     
	private List<CompteEpargne> CompteEpargne;  
	
	public CompteEpargne()
	{
		// Appel du constructeur explicite sans parametre 
		// de la classe CompteBancaire
		
		super();  
	} 
	
	public CompteEpargne(int id, int numero, float solde,  
			String nom, String prenom, float tauxInteret)  
	
	{
		super(id, numero, solde, 
			 nom, prenom);
		this.tauxInteret = tauxInteret; 
	}

	 
	public void calculInteret(float solde) 
	{
		solde = solde*(1+tauxInteret/100);   
	}

	public float getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(float tauxInteret) {  
		this.tauxInteret = tauxInteret;
	}
	
	

	public List<CompteEpargne> getCompteEpargne() { 
		return CompteEpargne; 
	}

	public void setCompteEpargne(List<CompteEpargne> compteEpargne) {
		CompteEpargne = compteEpargne;
	}

	@Override
	public String toString() {
		return super.toString() + ", [tauxInteret=" + tauxInteret + "]";  
	}

	@Override
	public String getNomComplet() { 
		
		 return "CompteEpargne: " + super.getPrenom()+ "  " + super.getNom();
	}
	 
	
	
	
}
