package com.jeremd.keyboardshortcutsmemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "raccourci")
public class Raccourci {

	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** libelle */
	private String libelle;

	/** description */
	private String description;

	/** touches */
	private String touches;

	/** nomProgramme */
	@ManyToOne
	@JoinColumn(name = "id_prog")
	@JsonBackReference
	private Programme nomProgramme;

	/**
	 * Constructor
	 *
	 */
	public Raccourci() {
	}

	/**
	 * Constructor
	 *
	 * @param libelle
	 * @param description
	 * @param touches
	 * @param nomProgramme
	 */
	public Raccourci(String libelle, String description, String touches) {
		this.libelle = libelle;
		this.description = description;
		this.touches = touches;
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
	public Programme getProgramme() {
		return nomProgramme;
	}

	/**
	 * Setter
	 *
	 * @param nomProgramme to set
	 */
	public void setProgramme(Programme nomProgramme) {
		this.nomProgramme = nomProgramme;
	}

}
