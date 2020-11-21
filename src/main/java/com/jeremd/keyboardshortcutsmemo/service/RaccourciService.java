package com.jeremd.keyboardshortcutsmemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeremd.keyboardshortcutsmemo.dto.ModifierRaccourciDto;
import com.jeremd.keyboardshortcutsmemo.entity.Raccourci;
import com.jeremd.keyboardshortcutsmemo.repository.RaccourciRepo;

@Service
public class RaccourciService {

	/** raccourciRepo */
	@Autowired
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
	 * @param programme 
	 * 
	 * @param programme
	 * @return raccourci du logiciel
	 */
	public List<Raccourci> afficher(String programme) {
		return raccourciRepo.findByProgramme(programme);
	}

	/**
	 * Ajouter un raccourci
	 * 
	 * @param libelle
	 * @param description
	 * @param touches
	 * @param programme
	 * @return Raccourci ajouté
	 */
	public Raccourci ajouter(String libelle, String description, String touches, String programme) {
		return raccourciRepo.save(new Raccourci(libelle, description, touches, programme));
	}
	
	/**
	 * Modifier un raccourci
	 * 
	 * @param modificationRaccourci
	 * @param programme
	 * @return
	 */
	public Raccourci modifier(ModifierRaccourciDto modificationRaccourci, Integer id) {
		Raccourci raccourci = raccourciRepo.findById(id);
		raccourci.setLibelle(modificationRaccourci.getLibelle());
		raccourci.setDescription(modificationRaccourci.getDescription());
		raccourci.setTouche(modificationRaccourci.getTouches());
		return raccourciRepo.save(raccourci);
	}

}
