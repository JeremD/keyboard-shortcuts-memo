package com.jeremd.keyboardshortcutsmemo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "programme")
public class Programme {

	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** categorie */
	private String categorie;

	/** nom */
	private String nom;

	/** raccourci */
	@OneToMany(mappedBy = "nomProgramme", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Raccourci> raccourci = new ArrayList<Raccourci>();

	/**
	 * Constructor
	 *
	 */
	public Programme() {
	}

	/**
	 * Constructor
	 * 
	 * @param categorie
	 * @param nom
	 * @param raccourci
	 */
	public Programme(String categorie, String nom) {
		this.categorie = categorie;
		this.nom = nom;
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
	 * @return the raccourci
	 */
	public List<Raccourci> getRaccourci() {
		return raccourci;
	}

	/**
	 * Setter
	 *
	 * @param raccourci to set
	 */
	public void setRaccourci(List<Raccourci> raccourci) {
		this.raccourci = raccourci;
	}

}
