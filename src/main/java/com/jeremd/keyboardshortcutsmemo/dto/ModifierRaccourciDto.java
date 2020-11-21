package com.jeremd.keyboardshortcutsmemo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jeremd.keyboardshortcutsmemo.entity.Programme;

public class ModifierRaccourciDto {

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

	/**
	 * Constructor
	 *
	 */
	public ModifierRaccourciDto() {
	}

	/**
	 * Constructor
	 *
	 * @param libelle
	 * @param description
	 * @param touches
	 * @param programme
	 */
	public ModifierRaccourciDto(@NotBlank @Size(min = 5) String libelle, @Size(min = 5) String description, @NotBlank String touches) {
		this.libelle = libelle;
		this.description = description;
		this.touches = touches;
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

}
