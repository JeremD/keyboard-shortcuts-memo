package com.jeremd.keyboardshortcutsmemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeremd.keyboardshortcutsmemo.dto.CreerProgrammeDto;
import com.jeremd.keyboardshortcutsmemo.dto.ModifierProgrammeDto;
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
	@GetMapping("all")
	public ResponseEntity<List<Programme>> listerAllProgrammes() {
		return ResponseEntity.ok(programmeService.lister());
	}

	
	/**
	 * Afficher un programme
	 * 
	 * @param libelle
	 * @return programme
	 */
	@GetMapping
	public ResponseEntity<Programme> listerLibelleProgramme(@RequestParam String libelle) {
		return ResponseEntity.status(HttpStatus.OK).body(programmeService.listerParLibelle(libelle));
	}
	
	/**
	 * Lister les programmes par catégorie
	 * 
	 * @param categorie
	 * @return programme
	 */
	@GetMapping("{categorie}")
	public ResponseEntity<List<Programme>> listerCategorieProgramme(@PathVariable String categorie) {
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
	public ResponseEntity<?> ajouterProgramme(@Valid @RequestBody CreerProgrammeDto programme, BindingResult result) {

		Programme ajoutProgramme = programmeService.ajouter(programme.getLibelle(), programme.getNom(), programme.getCategorie());
		ProgrammeDto programmeDto = new ProgrammeDto(ajoutProgramme.getLibelle(), ajoutProgramme.getCategorie(), ajoutProgramme.getNom());

		return ResponseEntity.ok(programmeDto);
	}

	/**
	 * Modifier un programme
	 * 
	 * @param programme
	 * @param libelle
	 * @param result
	 * @return programme modified
	 */
	@PatchMapping("{libelle}")
	public ResponseEntity<?> modifierProgramme(@RequestBody ModifierProgrammeDto programme, @PathVariable String libelle, BindingResult result) {
		return ResponseEntity.ok(programmeService.modifier(programme, libelle));
	}
	
	/**
	 * Supprimer un programme
	 * 
	 * @param libelle
	 * @return programme deleted
	 */
	@DeleteMapping("{libelle}")
	public ResponseEntity<?> supprimerProgramme(@PathVariable String libelle) {
		programmeService.supprimer(libelle);
		return ResponseEntity.ok("Programme " + libelle + " supprimé");
	}
}
