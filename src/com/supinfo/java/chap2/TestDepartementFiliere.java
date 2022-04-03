package com.supinfo.java.chap2;

import java.util.ArrayList;
import java.util.List;

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
		
		
		for(Departement departement: listDepartement) 
		{   
			System.out.println("Departement :" +departement.getNom());  
			for(Filiere filiere: departement.getFiliere())    
			{
				System.out.println(filiere); 
				System.out.println("==================================");  
				
			}  
			
		}   
		
		
		
		

	}    

}
