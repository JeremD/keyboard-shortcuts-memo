package com.jeremd.keyboardshortcutsmemo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jeremd.keyboardshortcutsmemo.entity.Programme;

public class CreerRaccourciDto {

	/** libelle */
	@NotBlank
	@Size(min = 5)
	@JsonProperty("libelle")
	private String libelle;

	/** description */
	@Size(min = 5)
	@JsonProperty("description")
	private String description;

	/** touches */
	@NotBlank
	@JsonProperty("touches")
	private String touches;
	
	/** touches */
	@NotBlank
	@Size(min = 2)
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
	 * @param programme
	 */
	public CreerRaccourciDto(@NotBlank @Size(min = 5) String libelle, @Size(min = 5) String description,
			@NotBlank String touches, @NotBlank @Size(min = 2) Programme programme) {
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
