package com.jeremd.keyboardshortcutsmemo.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.jeremd.keyboardshortcutsmemo.entity.Raccourci;
import com.jeremd.keyboardshortcutsmemo.repository.RaccourciRepo;

public class RaccourciService {

	/** raccourciRepo */
	private RaccourciRepo raccourciRepo;

	/**
	 * Constructor
	 *
	 * @param raccourciRepo
	 */
	public RaccourciService(RaccourciRepo raccourciRepo) {
		this.raccourciRepo = raccourciRepo;
	}

	/**
	 * Afficher les raccourcis
	 * 
	 * @return List of Raccourci
	 */
	public List<Raccourci> afficher() {
		return raccourciRepo.findAll();
	}

	/**
	 * Ajouter un raccourci
	 * 
	 * @param libelle
	 * @param nom
	 * @param touches
	 * @return Raccourci ajouté
	 */
	@Transactional
	public Raccourci ajouter(String libelle, String nom, String touches) {
		return raccourciRepo.save(new Raccourci(libelle, nom, touches));
	}

}
