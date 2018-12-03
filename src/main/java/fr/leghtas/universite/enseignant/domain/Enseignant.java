package fr.leghtas.universite.enseignant.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Enseignant {

	private Integer id;
	@JsonProperty("numero")
	private Integer numEnseignant;

	private String nom;

	private String prenom;

	private String dateNaissance;

	private String sexe;

	private String grade;

	private String dateEmbauche;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumEnseignant() {
		return numEnseignant;
	}

	public void setNumEnseignant(Integer numEnseignant) {
		this.numEnseignant = numEnseignant;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

}
