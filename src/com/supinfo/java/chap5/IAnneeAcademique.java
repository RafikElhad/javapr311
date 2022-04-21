package com.supinfo.java.chap5;

import java.util.List;

import com.supinfo.java.chap2.AnneeAcademique;

public interface IAnneeAcademique 
{ 
	void addAnneeAcademique(AnneeAcademique annee);  
	AnneeAcademique getAnneeAcademiqueById(long id); 
	List<AnneeAcademique> getAllAnneeAcademique();
	void updateAnneeAcademique(AnneeAcademique annee);
	void deleteAnneeAcademique(AnneeAcademique annee); 

}
