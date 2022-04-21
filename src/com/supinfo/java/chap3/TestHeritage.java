package com.supinfo.java.chap3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestHeritage {

	public static void main(String[] args) 
	{
		LocalDate dateNaissance = LocalDate.parse("2004-05-22");
		LocalDate dateNaissance2 = LocalDate.parse("1979-05-22");
		Etudiant etudiant1 = new Etudiant(1, "Rafiou", "Elhad",dateNaissance,
				"Magoudjou", "77 262 57 42", "rafiou@gmail.com", "Moroni", 
				"Comorien", "Masculain", "DIDK005373");   
		
		List<ContactEtudiant> listContactEtudiant = new ArrayList<>();  
		ContactEtudiant contactEtudiant1 = new ContactEtudiant(1,"Rabouanta",
				"Elhad", "00269 333 46 47", "Magoudjou", "rabouanta@gmail.com",
				"Tuteur");
	 
		
		ContactEtudiant contactEtudiant2 = new ContactEtudiant(2,"Rafik",
				"Elhad", "00269 333 46 47", "Hadoudja", "rabouanta@gmail.com",
				"Tuteur");
		
		
		listContactEtudiant.add(contactEtudiant1);
		etudiant1.setContactEtudiant(listContactEtudiant); 

		listContactEtudiant.add(contactEtudiant2); 
		etudiant1.setContactEtudiant(listContactEtudiant); 
		
		Prof prof1 = new Prof(1, "Mohamed", "Maoudjoud", dateNaissance2,  "Hadoudja", 
				"78 235 12 25", "mohamed@gmail.com", "Heroumbili", 
				"Comorien", "Masculin", "Programmation");   
		
		List<Personne> listPersonne = new ArrayList<>(); 
		listPersonne.add(etudiant1);
		listPersonne.add(prof1);
	
		
		for(Personne personne: listPersonne)  
		{
			if(personne instanceof Etudiant) 
			{
				Etudiant etudiant = (Etudiant) personne; 
				System.out.println(etudiant); 
				System.out.println("Liste des contacts de l'etudiant"); 
				for(ContactEtudiant contactEtudiant : etudiant.getContactEtudiant()) 
				{
					System.out.println(contactEtudiant); 
				}
			} 
			else if(personne instanceof Prof) 
			{
				Prof prof = (Prof) personne; 
				System.out.println(prof); 
				System.out.println("Liste des profs");  
			}
		}
		
		

	}

}
