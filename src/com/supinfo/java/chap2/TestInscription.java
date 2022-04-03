package com.supinfo.java.chap2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.supinfo.java.chap4.CompteCourant;

public class TestInscription {

	public static void main(String[] args) 
	{ 
		
		
		LocalDate dateInscription = LocalDate.parse("2000-05-25");  
		
		Inscription inscription1 = new Inscription(dateInscription); 
		
		AnneeAcademique AnneeAcademique1 = new AnneeAcademique("l'annee en cours deh",
				"cette annee va etre tres chaud deh");

		Niveau niveau1 = new Niveau("Licence 3"); 
		
		
		Filiere filiere1 = new Filiere("Programmation", "Conception des application mobiles");  
	    
		AnneeAcademique1.setInscription(inscription1);
		niveau1.setInscription(inscription1);
		filiere1.setInscription(inscription1); 
		
		
		System.out.println(inscription1);     
		
		
	}

}
