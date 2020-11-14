package com.jeremd.keyboardshortcutsmemo.entity;

import java.util.List;

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
	
	@OneToMany(mappedBy="raccourci")
	private List<Raccourci> raccourci;
	
	/**
	 * Constructor
	 *
	 */
	public Programme() {
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param categorie
	 * @param nom
	 */
	public Programme(Integer id, String categorie, String nom, List<Raccourci> raccourci) {
		this.id = id;
		this.categorie = categorie;
		this.nom = nom;
		this.raccourci = raccourci;
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
