package com.jeremd.keyboardshortcutsmemo.service;

import java.util.List;
import java.util.Optional;

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
	 * @return raccourci du programme
	 */
	public List<Raccourci> lister(String programme) {
		return raccourciRepo.findByProgramme(programme);
	}
	
	/**
	 * Trouver l'id d'un raccourci
	 * 
	 * @param id
	 * @return raccourci du programme
	 */
	public Optional<Raccourci> afficher(Integer id) {
		return raccourciRepo.findById(id);
	}

	/**
	 * Trouver le libelle d'un raccourci
	 * 
	 * @param libelle
	 * @return
	 */
	public Raccourci afficherParLibelle(String libelle) {
		return raccourciRepo.findByLibelle(libelle);
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
	@Transactional
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
	@Transactional
	public Raccourci modifier(ModifierRaccourciDto modificationRaccourci, Integer id) {
		Raccourci raccourci = raccourciRepo.findById(id).get();
		raccourci.setLibelle(modificationRaccourci.getLibelle());
		raccourci.setDescription(modificationRaccourci.getDescription());
		raccourci.setTouche(modificationRaccourci.getTouches());
		return raccourciRepo.save(raccourci);
	}
	
	/**
	 * Supprimer un raccourci
	 * 
	 * @param id
	 */
	@Transactional
	public void supprimer(Integer id) {
		raccourciRepo.deleteById(id);
	}

}
