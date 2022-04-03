package com.supinfo.java.chap1;

import java.time.LocalDate;

public class TestPersonne 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub  
		{
			Personne personne1 = new Personne();  
			Personne personne2 = new Personne();   
			
			LocalDate dateNaissance = LocalDate.parse("2000-05-25");  
			LocalDate dateNaissance2 = LocalDate.parse("2005-02-22");      
			personne1.setId(1);  
			personne1.setPrenom("Rafik");   
			personne1.setNom("Elhad"); 
			personne1.setAdresse("Moroni");  
			personne1.setDateNaissance(dateNaissance);  
			personne1.setTelephone("77 262 57 42"); 
			personne1.setEmail("rafik.elhad269@gmail.com");    
			
			personne2.setId(2);
			personne2.setPrenom("Fatima");   
			personne2.setNom("Mohamed Abdou"); 
			personne2.setAdresse("Magoudjou");  
			personne2.setDateNaissance(dateNaissance2);   
			personne2.setTelephone("77 262 57 55"); 
			personne2.setEmail("fatima.mohamed269@gmail.com");   
			
			Personne personne3 = new Personne(3, "Mohamed", "Elhad", dateNaissance2, "Zirembweni",
					"77 262 57 42", "rafik@gmail.com");  
			
			
			System.out.println(personne1); 
			System.out.println(personne2);    
			System.out.println(personne3); 
		}


	}

}
