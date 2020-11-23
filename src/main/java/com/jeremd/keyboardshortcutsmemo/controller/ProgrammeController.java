package com.jeremd.keyboardshortcutsmemo.controller;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeremd.keyboardshortcutsmemo.dto.CodeErreur;
import com.jeremd.keyboardshortcutsmemo.dto.CreerProgrammeDto;
import com.jeremd.keyboardshortcutsmemo.dto.MessageErreurDto;
import com.jeremd.keyboardshortcutsmemo.dto.ModifierProgrammeDto;
import com.jeremd.keyboardshortcutsmemo.dto.ProgrammeDto;
import com.jeremd.keyboardshortcutsmemo.dto.ProgrammeMapper;
import com.jeremd.keyboardshortcutsmemo.entity.Programme;
import com.jeremd.keyboardshortcutsmemo.exception.ProgrammeAlreadyExistsException;
import com.jeremd.keyboardshortcutsmemo.exception.ProgrammeException;
import com.jeremd.keyboardshortcutsmemo.exception.ProgrammeNotFoundException;
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
	public ResponseEntity<List<Programme>> listerAllProgrammes() {
		return ResponseEntity.ok(programmeService.lister());
	}

	
	/**
	 * Afficher un programme
	 * 
	 * @param libelle
	 * @return programme
	 */
	@GetMapping("/nom/{libelle}")
	public ResponseEntity<Programme> afficherProgramme(@PathVariable String libelle) {
		
		Programme programmeFound = programmeService.listerParLibelle(libelle);
		
		if (programmeFound != null) {
			return ResponseEntity.ok(programmeFound);
		} else {
			throw new ProgrammeNotFoundException(new MessageErreurDto(CodeErreur.VALIDATION, "Programme non trouvé"));
		}
	
	}
	
	/**
	 * Lister les programmes par catégorie
	 * 
	 * @param categorie
	 * @return programme
	 */
	@GetMapping("/type/{categorie}")
	public ResponseEntity<List<Programme>> listerCategorieProgramme(@PathVariable String categorie) {
		
		List<Programme> programmeFound = programmeService.listerParCategorie(categorie);
		
		if (programmeFound != null) {
			return ResponseEntity.ok(programmeFound);
		} else {
			throw new ProgrammeNotFoundException(new MessageErreurDto(CodeErreur.VALIDATION, "Type de programme non trouvé"));
		}
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
		
		if(result.hasErrors()) {
			throw new ProgrammeException(new MessageErreurDto(CodeErreur.CREATION, "Donnée(s) invalide(s) pour l'ajout du programme"));
		}
		
		if (programmeService.listerParLibelle(programme.getLibelle()) != null) {
			throw new ProgrammeAlreadyExistsException(new MessageErreurDto(CodeErreur.CREATION, "Un autre programme possède ce libellé"));
		} else if (programmeService.listerParNom(programme.getNom()) != null) {
			throw new ProgrammeAlreadyExistsException(new MessageErreurDto(CodeErreur.CREATION, "Un autre programme possède ce nom"));
		}
		
		Programme nouveauProgramme = programmeService.ajouter(programme.getLibelle(), programme.getNom(), programme.getCategorie());
		ProgrammeDto programmeDto = ProgrammeMapper.INSTANCE.programmeToProgrammeDto(nouveauProgramme);
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
	@PatchMapping("/nom/{libelle}")
	public ResponseEntity<?> modifierProgramme(@RequestBody ModifierProgrammeDto programme, @PathVariable String libelle, BindingResult result) {
		
		if(result.hasErrors()) {
			throw new ProgrammeException(new MessageErreurDto(CodeErreur.MODIFICATION, "Donnée(s) invalide(s) pour la modification du programme"));
		}
		
		return ResponseEntity.ok(programmeService.modifier(programme, libelle));
	}
	
	/**
	 * Supprimer un programme
	 * 
	 * @param libelle
	 * @return programme deleted
	 */
	@DeleteMapping("/nom/{libelle}")
	public ResponseEntity<?> supprimerProgramme(@PathVariable String libelle) {
		
		if (programmeService.listerParLibelle(libelle) == null) {
			throw new ProgrammeNotFoundException(new MessageErreurDto(CodeErreur.SUPPRESSION, "Libellé du programme à supprimer non trouvé"));
		}
		
		programmeService.supprimer(libelle);
		return ResponseEntity.ok("Programme " + libelle + " supprimé");
	}
}
