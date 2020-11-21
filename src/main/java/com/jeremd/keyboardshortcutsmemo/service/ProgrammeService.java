package com.jeremd.keyboardshortcutsmemo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeremd.keyboardshortcutsmemo.dto.ModifierProgrammeDto;
import com.jeremd.keyboardshortcutsmemo.entity.Programme;
import com.jeremd.keyboardshortcutsmemo.repository.ProgrammeRepo;

/**
 * @author Jeremy
 *
 */
/**
 * @author Jeremy
 *
 */
@Service
public class ProgrammeService {

	/** programmeRepo */
	private ProgrammeRepo programmeRepo;
	
	/**
	 * Constructor
	 *
	 * @param programmeRepo
	 */
	public ProgrammeService(ProgrammeRepo programmeRepo) {
		this.programmeRepo = programmeRepo;
	}
	
	/**
	 * Lister tous les programmes
	 * 
	 * @return List of Programme
	 */
	public List<Programme> lister() {
		return programmeRepo.findAll();
	}
	
	/**
	 * Lister les catégories
	 * 
	 * @param categorie
	 * @return
	 */
	public List<Programme> listerParCategorie(String categorie) {
		return programmeRepo.findByCategorie(categorie);
	}
	
	/**
	 * Lister par libelle
	 * 
	 * @param libelle
	 * @return
	 */
	public Programme listerParLibelle(String libelle) {
		return programmeRepo.findByLibelle(libelle);
	}
	
	
	/**
	 * Ajouter un programme
	 * 
	 * @param libelle
	 * @param nom
	 * @param categorie
	 * @return Programme added
	 */
	@Transactional
	public Programme ajouter(String libelle, String nom, String categorie) {
		return programmeRepo.save(new Programme(libelle, nom, categorie));
	}
	
	/**
	 * Modifier un programme
	 * 
	 * @param modificationProgramme
	 * @param libelle
	 * @return programme modified
	 */
	@Transactional
	public Programme modifier(ModifierProgrammeDto modificationProgramme, String libelle) {
		Programme programme = programmeRepo.findByLibelle(libelle);
		programme.setNom(modificationProgramme.getNom());
		programme.setCategorie(modificationProgramme.getCategorie());
		return programmeRepo.save(programme);
	}
	
	/**
	 * Supprimer un programme
	 * 
	 * @param libelle
	 */
	public void supprimer(String libelle) {
		programmeRepo.deleteById(libelle);
	}
	
}
