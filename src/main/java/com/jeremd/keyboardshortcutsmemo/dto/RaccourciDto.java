package com.jeremd.keyboardshortcutsmemo.dto;

import javax.persistence.Id;

import com.jeremd.keyboardshortcutsmemo.entity.Programme;

public class RaccourciDto {

	/** id */
	@Id
	private Integer id;

	/** libelle */
	private String libelle;

	/** description */
	private String description;

	/** touche */
	private String touche;

	/** programme */
	private Programme programme;

	/**
	 * Constructor
	 *
	 */
	public RaccourciDto() {
	}

	/**
	 * Constructor
	 *
	 * @param id
	 * @param libelle
	 * @param description
	 * @param touche
	 * @param programme
	 */
	public RaccourciDto(Integer id, String libelle, String description, String touche, Programme programme) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.touche = touche;
		this.programme = programme;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter
	 *
	 * @param description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter
	 *
	 * @return the touche
	 */
	public String getTouche() {
		return touche;
	}

	/**
	 * Setter
	 *
	 * @param touche to set
	 */
	public void setTouche(String touche) {
		this.touche = touche;
	}

	/**
	 * Getter
	 *
	 * @return the programme
	 */
	public Programme getProgramme() {
		return programme;
	}

	/**
	 * Setter
	 *
	 * @param programme to set
	 */
	public void setProgramme(Programme programme) {
		this.programme = programme;
	}

}
