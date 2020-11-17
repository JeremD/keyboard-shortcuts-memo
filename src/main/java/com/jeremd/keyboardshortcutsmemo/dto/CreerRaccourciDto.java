package com.jeremd.keyboardshortcutsmemo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jeremd.keyboardshortcutsmemo.entity.Programme;

public class CreerRaccourciDto {

	/** libelle */
	@NotBlank
	@JsonProperty("libelle")
	private String libelle;

	/** description */
	@JsonProperty("description")
	private String description;

	/** touches */
	@NotBlank
	@JsonProperty("touches")
	private String touches;
	
	/** touches */
	@NotBlank
	@JsonProperty("programme")
	private Programme programme;

	/**
	 * Constructor
	 *
	 */
	public CreerRaccourciDto() {
	}

	/**
	 * Constructor
	 *
	 * @param libelle
	 * @param description
	 * @param touches
	 */
	public CreerRaccourciDto(@NotBlank String libelle, String description, @NotBlank String touches, @NotBlank Programme programme) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.touches = touches;
		this.programme = programme;
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
	public String getTouches() {
		return touches;
	}

	/**
	 * Setter
	 *
	 * @param touches to set
	 */
	public void setTouches(String touches) {
		this.touches = touches;
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
