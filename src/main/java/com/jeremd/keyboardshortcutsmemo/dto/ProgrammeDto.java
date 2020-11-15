package com.jeremd.keyboardshortcutsmemo.dto;

import org.springframework.data.annotation.Id;

public class ProgrammeDto {

	/** id */
	@Id
	private Integer id;

	/** categorie */
	private String categorie;

	/** nom */
	private String nom;

	/**
	 * Constructor
	 *
	 */
	public ProgrammeDto() {
	}

	/**
	 * Constructor
	 *
	 * @param id
	 * @param categorie
	 * @param nom
	 * @param raccourci
	 */
	public ProgrammeDto(Integer id, String categorie, String nom) {
		this.id = id;
		this.categorie = categorie;
		this.nom = nom;
	}

	/**
	 * Getter
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 *
	 * @param id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
