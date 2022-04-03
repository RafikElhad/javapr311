package com.supinfo.java.chap4;

public class ContactEtudiant 
{ 
	private long id; 
	private String prenomContact; 
	private String nomContact;
	private String telephoneContact;
	private String adresseContact;
	private String emailContact;
	private String lienParente;  
	
	public ContactEtudiant() {}  
	
	public ContactEtudiant(long id, String prenom, String nom, String telephone,
			String adresse, String email, String lienParente) 
	
	{
		this.id = id; 
		this.prenomContact = prenom; 
		this.nomContact = nom;  
		this.telephoneContact = telephone; 
		this.adresseContact = adresse; 
		this.emailContact = email; 
		this.lienParente = lienParente; 
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrenomContact() {
		return prenomContact;
	}

	public void setPrenomContact(String prenomContact) {
		this.prenomContact = prenomContact;
	}

	public String getNomContact() {
		return nomContact;
	}

	public void setNomContact(String nomContact) {
		this.nomContact = nomContact;
	}

	public String getTelephoneContact() {
		return telephoneContact;
	}

	public void setTelephoneContact(String telephoneContact) {
		this.telephoneContact = telephoneContact;
	}

	public String getAdresseContact() {
		return adresseContact;
	}

	public void setAdresseContact(String adresseContact) { 
		this.adresseContact = adresseContact;
	}

	public String getEmailContact() {
		return emailContact;
	}

	public void setEmailContact(String emailContact) {
		this.emailContact = emailContact;
	}

	public String getLienParente() {
		return lienParente;
	}

	public void setLienParente(String lienParente) { 
		this.lienParente = lienParente;
	}

	@Override
	public String toString() {
		return "ContactEtudiant [id=" + id + ", prenomContact=" + prenomContact + ", nomContact=" + nomContact
				+ ", telephoneContact=" + telephoneContact + ", adresseContact=" + adresseContact + ", emailContact="
				+ emailContact + ", lienParente=" + lienParente + "]";
	} 
	
	

}
