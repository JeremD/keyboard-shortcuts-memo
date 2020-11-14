package com.jeremd.keyboardshortcutsmemo.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeremd.keyboardshortcutsmemo.dto.CreerProgrammeDto;
import com.jeremd.keyboardshortcutsmemo.dto.ProgrammeDto;
import com.jeremd.keyboardshortcutsmemo.entity.Programme;
import com.jeremd.keyboardshortcutsmemo.service.ProgrammeService;

@RestController
@RequestMapping
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
	@GetMapping("/programmes")
	public ResponseEntity<?> listerProgrammes() {
		return ResponseEntity.status(HttpStatus.OK).body(programmeService.lister());
	}

	/**
	 * Ajouter un nouveau programme
	 * 
	 * @param programme
	 * @param result
	 * @return Programme added
	 */
	@PostMapping("/programmes")
	public ProgrammeDto ajouterProgramme(@RequestBody @Valid CreerProgrammeDto programme, BindingResult result) {

		Programme ajoutProgramme = programmeService.ajouter(programme.getCategorie(), programme.getNom());

		ProgrammeDto programmeDto = new ProgrammeDto();
		programmeDto.setId(ajoutProgramme.getId());
		programmeDto.setCategorie(ajoutProgramme.getCategorie());
		programmeDto.setNom(ajoutProgramme.getNom());

		return programmeDto;

	}

}
