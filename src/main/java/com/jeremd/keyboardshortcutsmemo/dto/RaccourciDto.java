package com.jeremd.keyboardshortcutsmemo.dto;

import org.springframework.data.annotation.Id;

import com.jeremd.keyboardshortcutsmemo.entity.Programme;

public class RaccourciDto {

	/** id */
	@Id
	private Integer id;

	/** libelle */
	private String libelle;

	/** description */
	private String description;

	/** touches */
	private String touches;

	/** nomProgramme */
	private String nomProgramme;

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
	 * @param touches
	 */
	public RaccourciDto(Integer id, String libelle, String description, String touches) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.touches = touches;
	}
	
	/**
	 * Constructor
	 *
	 * @param id
	 * @param libelle
	 * @param description
	 * @param touches
	 * @param nomProgramme
	 */
	public RaccourciDto(Integer id, String libelle, String description, String touches, String nomProgramme) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.touches = touches;
		this.nomProgramme = nomProgramme;
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
	 * @return the touches
	 */
	public String getTouche() {
		return touches;
	}

	/**
	 * Setter
	 *
	 * @param touches to set
	 */
	public void setTouche(String touches) {
		this.touches = touches;
	}

	/**
	 * Getter
	 *
	 * @return the nomProgramme
	 */
	public String getProgramme() {
		return nomProgramme;
	}

	/**
	 * Setter
	 *
	 * @param nomProgramme to set
	 */
	public void setProgramme(String nomProgramme) {
		this.nomProgramme = nomProgramme;
	}

}
