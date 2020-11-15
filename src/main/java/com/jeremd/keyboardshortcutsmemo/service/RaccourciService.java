package com.jeremd.keyboardshortcutsmemo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeremd.keyboardshortcutsmemo.entity.Raccourci;
import com.jeremd.keyboardshortcutsmemo.repository.RaccourciRepo;

@Service
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
	 * @param description
	 * @param touches
	 * @return Raccourci ajouté
	 */
	@Transactional
	public Raccourci ajouter(String libelle, String description, String touches) {
		return raccourciRepo.save(new Raccourci(libelle, description, touches));
	}

}
