package com.supinfo.java.chap4;

import java.util.ArrayList;
import java.util.List;

import com.supinfo.java.chap3.ContactEtudiant;

public class TestClasseAbstraiteBanquaire {

	public static void main(String[] args)  
	{
		
		List<CompteCourant> listCompteCourant = new ArrayList<>();   

		CompteCourant CompteCourant1 = new  CompteCourant(1, 234567,345678,
				"Fatima", "Mohamed", 6);   
		
		listCompteCourant.add(CompteCourant1);
		CompteCourant1.setCompteCourant(listCompteCourant);    
		
		
		CompteEpargne CompteEpargne1 = new CompteEpargne(1,789098,9876,
				"Rafik", "Elhad", 6); 
		
		CompteEpargne CompteEpargne2 = new CompteEpargne(2,98765,2345,
				"Rafiou", "Elhad", 10);  
		
		
       
		List<CompteEpargne> listCompteEpargne = new ArrayList<>(); 
		
		listCompteEpargne.add(CompteEpargne1);
		listCompteEpargne.add(CompteEpargne2); 
		CompteEpargne1.setCompteEpargne(listCompteEpargne);     
		CompteEpargne2.setCompteEpargne(listCompteEpargne); 
		
		
		System.out.println("Listes des compte courants qui existent ");
		System.out.println(listCompteCourant);  
		
		System.out.println("Liste des compte Epargne qui exixtent");
		System.out.println(listCompteEpargne); 
		
		
		
		
		
	}

}
