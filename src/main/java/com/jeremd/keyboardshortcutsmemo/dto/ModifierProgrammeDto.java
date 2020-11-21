package com.jeremd.keyboardshortcutsmemo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ModifierProgrammeDto {

	/** nom */
	@NotBlank
	@Size(min = 3)
	private String nom;
	
	/** categorie */
	@NotBlank
	@Size(min = 3)
	private String categorie;
	
	/**
	 * Constructor
	 *
	 */
	public ModifierProgrammeDto() {
	}

	/**
	 * Constructor
	 *
	 * @param nom
	 * @param categorie
	 */
	public ModifierProgrammeDto(@NotBlank @Size(min = 3) String nom, @NotBlank @Size(min = 3) String categorie) {
		this.nom = nom;
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