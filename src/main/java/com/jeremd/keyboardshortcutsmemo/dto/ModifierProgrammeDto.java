package com.jeremd.keyboardshortcutsmemo.dto;

import javax.validation.constraints.Size;

public class ModifierProgrammeDto {

	/** nom */
	@Size(min = 3)
	private String nom;
	
	/** categorie */
	@Size(min = 3)
	private String categorie;

	/**
	 * Constructor
	 *
	 */
	public ModifierProgrammeDto() {
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
