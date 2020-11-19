package com.jeremd.keyboardshortcutsmemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

	/** programme */
//	@ManyToOne
//	private Programme programme;
	
	/** programme */
	private String programme;

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
	 */
	public Raccourci(String libelle, String description, String touches, String programme) {
		this.libelle = libelle;
		this.description = description;
		this.touches = touches;
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
	 * @return the programme
	 */
	public String getProgramme() {
		return programme;
	}

	/**
	 * Setter
	 *
	 * @param programme to set
	 */
	public void setProgramme(String programme) {
		this.programme = programme;
	}

}
