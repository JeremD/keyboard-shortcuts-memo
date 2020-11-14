package com.jeremd.keyboardshortcutsmemo.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;

import com.jeremd.keyboardshortcutsmemo.entity.Raccourci;

public class ProgrammeDto {

	/** id */
	@Id
	private Integer id;

	/** categorie */
	private String categorie;

	/** nom */
	private String nom;
	
	/** raccourci */
	private List<Raccourci> raccourci = new ArrayList<Raccourci>();
	
	/**
	 * Constructor
	 *
	 */
	public ProgrammeDto() {
	}

	/**
	 * Constructor
	 *
	 * @param id
	 * @param categorie
	 * @param nom
	 * @param raccourci
	 */
	public ProgrammeDto(Integer id, String categorie, String nom, List<Raccourci> raccourci) {
		super();
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
