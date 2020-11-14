package com.jeremd.keyboardshortcutsmemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

	/** touche */
	private String touche;
	
	@ManyToOne
	@JoinColumn(name = "id_prog")
	private Programme programme;

	/**
	 * Constructor
	 *
	 */
	public Raccourci() {
	}

	/**
	 * Constructor
	 *
	 * @param id
	 * @param libelle
	 * @param description
	 * @param touche
	 */
	public Raccourci(Integer id, String libelle, String description, String touche) {
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.touche = touche;
	}

	/**
	 * Getter
	 *
	 * @return the id
	 */
	public Integer getid() {
		return id;
	}

	/**
	 * Setter
	 *
	 * @param id to set
	 */
	public void setid(Integer id) {
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
