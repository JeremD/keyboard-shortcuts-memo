package com.jeremd.keyboardshortcutsmemo.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreerProgrammeDto {

	/** categorie */
	@NotBlank
	@JsonProperty("categorie")
	private String categorie;

	/** nom */
	@NotBlank
	@JsonProperty("nom")
	private String nom;
	
	/**
	 * Constructor
	 *
	 */
	public CreerProgrammeDto() {
	}

	/**
	 * Constructor
	 *
	 * @param categorie
	 * @param nom
	 */
	public CreerProgrammeDto(@NotBlank String categorie, @NotBlank String nom) {
		super();
		this.categorie = categorie;
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
	

}
