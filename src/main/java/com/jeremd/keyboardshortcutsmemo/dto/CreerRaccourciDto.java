package com.jeremd.keyboardshortcutsmemo.dto;

import javax.validation.constraints.NotBlank;

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

}
