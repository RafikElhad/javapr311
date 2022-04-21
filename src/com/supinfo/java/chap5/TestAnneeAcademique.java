package com.supinfo.java.chap5; 

import com.supinfo.java.chap2.AnneeAcademique; 

public class TestAnneeAcademique {

	public static void main(String[] args) 
	{
		
		AnneeAcademique anneeAcademique1 = new AnneeAcademique();
		anneeAcademique1.setId(1);
		anneeAcademique1.setLibelle("2021-2022");
		anneeAcademique1.setDescription("Annee académique 2021-2022"); 
		
		AnneeAcademique anneeAcademique2 = new AnneeAcademique();
		anneeAcademique1.setId(2);
		anneeAcademique1.setLibelle("2022-2023");
		anneeAcademique1.setDescription("Annee académique 2022-2023"); 
		
		AnneeAcademique anneeAcademique3 = new AnneeAcademique();
		anneeAcademique1.setId(3);
		anneeAcademique1.setLibelle("2020-2021");
		anneeAcademique1.setDescription("Annee académique 2020-2021");   
		
		IAnneeAcademique ianneeAcademique = new AnneeAcademiqueImpl();
		ianneeAcademique.addAnneeAcademique(anneeAcademique1);
		ianneeAcademique.addAnneeAcademique(anneeAcademique2);
		ianneeAcademique.addAnneeAcademique(anneeAcademique3); 
		
		for(AnneeAcademique anneeAcademique: ianneeAcademique.getAllAnneeAcademique())
		{
			System.out.println(anneeAcademique);
		}
		
		// Afficher une annee academique  
		
		//System.out.println(ianneeAcademique.getAnneeAcademiqueById(anneeAcademique));   
		
		
		
	}

}
