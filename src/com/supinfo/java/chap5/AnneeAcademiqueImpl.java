package com.supinfo.java.chap5;

import java.util.List;

import com.supinfo.java.chap2.AnneeAcademique;

public class AnneeAcademiqueImpl implements IAnneeAcademique 
{  
	private List<AnneeAcademique> listAnneeAcademique;

	@Override
	public void addAnneeAcademique(AnneeAcademique anneeAcademique) 
	{
		listAnneeAcademique.add(anneeAcademique); 

	}

	@Override
	public AnneeAcademique getAnneeAcademiqueById(long id) {
		
		AnneeAcademique anneeAcademique1 = new AnneeAcademique(); 
		for(AnneeAcademique anneeAcademique2: listAnneeAcademique)
		{
			if(anneeAcademique2.getId() == id) 
			{
				anneeAcademique1 = anneeAcademique2;
				break;
			}
		}
		
		return anneeAcademique1;
	}

	@Override
	public List<AnneeAcademique> getAllAnneeAcademique() {
		
		return listAnneeAcademique; 
	}

	@Override
	public void updateAnneeAcademique(AnneeAcademique annee) 
	{
		AnneeAcademique AnneeAcademique = getAnneeAcademiqueById(annee.getId());
		int position = listAnneeAcademique.indexOf(AnneeAcademique);
		listAnneeAcademique.add(position, annee); 

	}

	@Override
	public void deleteAnneeAcademique(AnneeAcademique annee)  
	{
		listAnneeAcademique.remove(annee); 

	}

}
