package com.jeremd.keyboardshortcutsmemo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeremd.keyboardshortcutsmemo.entity.Programme;
import com.jeremd.keyboardshortcutsmemo.repository.ProgrammeRepo;

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
	 * Lister les programmes
	 * 
	 * @return List of Programme
	 */
	public List<Programme> lister() {
		return programmeRepo.findAll();
	}
	
	/**
	 * Ajouter un programme
	 * 
	 * @param categorie
	 * @param nom
	 * @return Programme added
	 */
	@Transactional
	public Programme ajouter(String categorie, String nom) {
		return programmeRepo.save(new Programme(categorie, nom));
	}

}
