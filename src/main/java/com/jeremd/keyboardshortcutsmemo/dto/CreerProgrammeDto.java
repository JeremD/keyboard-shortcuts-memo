package com.jeremd.keyboardshortcutsmemo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreerProgrammeDto {

	/** libelle */
	@NotBlank
	@Size(min = 2)
	@JsonProperty("libelle")
	private String libelle;
	
	/** nom */
	@NotBlank
	@Size(min = 3)
	@JsonProperty("nom")
	private String nom;
	
	/** categorie */
	@NotBlank
	@Size(min = 3)
	@JsonProperty("categorie")
	private String categorie;

	/**
	 * Constructor
	 *
	 * @param libelle
	 * @param nom
	 * @param categorie
	 */
	public CreerProgrammeDto(@NotBlank @Size(min = 2) String libelle, @NotBlank @Size(min = 3) String nom,
			@NotBlank @Size(min = 3) String categorie) {
		super();
		this.libelle = libelle;
		this.nom = nom;
		this.categorie = categorie;
	}


	/**
	 * Getter
	 *
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}


	/**
	 * Setter
	 *
	 * @param libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	/**
	 * Getter
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * Setter
	 *
	 * @param nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * Getter
	 *
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}


	/**
	 * Setter
	 *
	 * @param categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

}
