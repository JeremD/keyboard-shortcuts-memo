package com.jeremd.keyboardshortcutsmemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "programme")
public class Programme {

	/** libelle */
	@Id
	@Column(name="libelle", unique=true)
	private String libelle;

	/** nom */
	private String nom;
	
	/** categorie */
	private String categorie;

	/**
	 * Constructor
	 *
	 */
	public Programme() {
	}
	

	/**
	 * Constructor
	 *
	 * @param libelle
	 * @param nom
	 * @param categorie
	 */
	public Programme(String libelle, String nom, String categorie) {
		this.libelle = libelle;
		this.nom = nom;
		this.categorie = categorie;
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * Setter
	 *
	 * @param nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * Getter
	 *
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}


	/**
	 * Setter
	 *
	 * @param categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
}
