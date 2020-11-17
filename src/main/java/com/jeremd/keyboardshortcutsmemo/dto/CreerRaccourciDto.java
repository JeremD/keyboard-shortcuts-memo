package com.jeremd.keyboardshortcutsmemo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

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
	public CreerRaccourciDto(@NotBlank String libelle, String description, @NotBlank String touches) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.touches = touches;
	}
	
	

}
