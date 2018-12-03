package fr.leghtas.universite.etudiant.domain;

public class Etudiant {

	private Integer id;

	private Integer numEtudiant;

	private String nom;

	private String prenom;

	private String dateNaissance;

	private String sexe;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumEtudiant() {
		return numEtudiant;
	}

	public void setNumEtudiant(Integer numEtudiant) {
		this.numEtudiant = numEtudiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

}
