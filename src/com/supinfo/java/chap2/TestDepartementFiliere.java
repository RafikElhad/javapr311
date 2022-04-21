package com.supinfo.java.chap2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List; 

import com.supinfo.java.chap4.Etudiant; 

public class TestDepartementFiliere {

	public static void main(String[] args)  
	{
		Departement departement1 = new Departement("Math-Info", 
				"Departement de Mathematique et" + "Informatique");    
		 
		
		Filiere filiere1 = new Filiere("Genie logiciel", 
				"Conception et dévéloppement logiciel");    
		
		Filiere filiere2 = new Filiere("Reseau et telecom", 
				"Réseau Télecommunication");  
		
		Departement departement2 = new Departement("Droit", 
				"Avocat  et" + "Juriste");   
		
		
		Filiere filiere3 = new Filiere("Science juridique", 
				"devenir un bon avocat");   
		
		Filiere filiere4 = new Filiere("Science des affaires",  
				"Droit des affaires impossibles");    
		
		
		filiere1.setDepartement(departement1);   
		filiere2.setDepartement(departement1);     
		
		filiere3.setDepartement(departement2); 
		filiere4.setDepartement(departement2);  
		
		Niveau niveau1 = new Niveau(1, " Licence 1"); 
		Niveau niveau2 = new Niveau(2, " Licence 2"); 
		Niveau niveau3 = new Niveau(3, " Licence 3"); 
		Niveau niveau4 = new Niveau(4, " Master 1"); 
		Niveau niveau5 = new Niveau(5, " Master 2");   
		
		AnneeAcademique anneeAcademique1 = new AnneeAcademique();
		anneeAcademique1.setId(1); 
		anneeAcademique1.setLibelle("2020-2021"); 
		anneeAcademique1.setDescription("Annee Academique 2022-2023"); 
		
		AnneeAcademique anneeAcademique2 = new AnneeAcademique();
		anneeAcademique2.setId(2); 
		anneeAcademique2.setLibelle("2021-2022"); 
		anneeAcademique2.setDescription("Annee Academique 2021-2022"); 
		
		LocalDate dateNaissance = LocalDate.parse("2004-05-22");
		Etudiant etudiant1 = new Etudiant(1, "Rafiou", "Elhad",dateNaissance,
				"Magoudjou", "77 262 57 42", "rafiou@gmail.com", "Moroni", 
				"Comorien", "Masculain", "DIDK005373");   
		LocalDate dateInscription = LocalDate.parse("2022-01-31");
		Inscription inscription1 = new Inscription(1, dateInscription,
				anneeAcademique2, filiere1, niveau1, etudiant1); 
		
		
		List<Filiere> listFiliere = new ArrayList<>();        
		listFiliere.add(filiere1); 
		listFiliere.add(filiere2); 
		departement1.setFiliere(listFiliere); 
		
		List<Filiere> listFiliereDroit = new ArrayList<>(); 
		listFiliereDroit.add(filiere3); 
		listFiliereDroit.add(filiere4); 
		departement2.setFiliere(listFiliereDroit);   
		
		List<Departement> listDepartement = new ArrayList<>(); 
		listDepartement.add(departement1);  
		listDepartement.add(departement2); 
		
		// Afficher les departement et leurs filieres   
		
		
		/*for(Departement departement: listDepartement) 
		{   
			System.out.println("Departement :" +departement.getNom());  
			for(Filiere filiere: departement.getFiliere())    
			{
				System.out.println(filiere); 
				System.out.println("==================================");  
				
			}  
			
		}   
		*/ 
		
		System.out.println(inscription1); 
		
		
		
		

	}    

}
