package com.jeremd.keyboardshortcutsmemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeremd.keyboardshortcutsmemo.dto.CreerProgrammeDto;
import com.jeremd.keyboardshortcutsmemo.dto.ProgrammeDto;
import com.jeremd.keyboardshortcutsmemo.entity.Programme;
import com.jeremd.keyboardshortcutsmemo.service.ProgrammeService;

@RestController
@RequestMapping("programmes")
public class ProgrammeController {

	/** programmeService */
	private ProgrammeService programmeService;

	/**
	 * Constructor
	 *
	 * @param programmeService
	 */
	public ProgrammeController(ProgrammeService programmeService) {
		this.programmeService = programmeService;
	}
	
	/**
	 * Lister tous les programmes
	 * 
	 * @return List of Programme
	 */
	@GetMapping
	public ResponseEntity<List<Programme>> listerProgrammes() {
		return ResponseEntity.status(HttpStatus.OK).body(programmeService.lister());
	}
	
	/**
	 * Lister les programmes selon catégories
	 * 
	 * @param categorie
	 * @return
	 */
	@GetMapping("{categorie}")
	public ResponseEntity<List<Programme>> listerCategories(@PathVariable String categorie) {
		return ResponseEntity.status(HttpStatus.OK).body(programmeService.listerParCategorie(categorie));
	}

	/**
	 * Ajouter un nouveau programme
	 * 
	 * @param programme
	 * @param result
	 * @return Programme added
	 */
	@PostMapping
	public ProgrammeDto ajouterProgramme(@RequestBody @Valid CreerProgrammeDto programme, BindingResult result) {

		Programme ajoutProgramme = programmeService.ajouter(programme.getCategorie(), programme.getNom());

		ProgrammeDto programmeDto = new ProgrammeDto();
		programmeDto.setId(ajoutProgramme.getId());
		programmeDto.setCategorie(ajoutProgramme.getCategorie());
		programmeDto.setNom(ajoutProgramme.getNom());

		return programmeDto;

	}

}
