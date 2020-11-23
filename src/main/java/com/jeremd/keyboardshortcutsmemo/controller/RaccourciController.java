package com.jeremd.keyboardshortcutsmemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeremd.keyboardshortcutsmemo.dto.CodeErreur;
import com.jeremd.keyboardshortcutsmemo.dto.CreerRaccourciDto;
import com.jeremd.keyboardshortcutsmemo.dto.MessageErreurDto;
import com.jeremd.keyboardshortcutsmemo.dto.ModifierRaccourciDto;
import com.jeremd.keyboardshortcutsmemo.dto.RaccourciDto;
import com.jeremd.keyboardshortcutsmemo.dto.RaccourciMapper;
import com.jeremd.keyboardshortcutsmemo.entity.Raccourci;
import com.jeremd.keyboardshortcutsmemo.exception.RaccourciAlreadyExistsException;
import com.jeremd.keyboardshortcutsmemo.exception.RaccourciException;
import com.jeremd.keyboardshortcutsmemo.exception.RaccourciNotFoundException;
import com.jeremd.keyboardshortcutsmemo.service.RaccourciService;

@RestController
@RequestMapping("raccourcis")
public class RaccourciController {

	private RaccourciService raccourciService;

	public RaccourciController(RaccourciService raccourciService) {
		this.raccourciService = raccourciService;
	}

	/**
	 *
	 * Lister les raccourcis d'un programme
	 * 
	 * @param programme
	 * @return List of raccourci
	 */
	@GetMapping
	public List<Raccourci> listerRaccourcis(@RequestParam String programme) {
		
		List<Raccourci> raccourciFound = raccourciService.lister(programme);
		
		if (raccourciFound == null) {
			throw new RaccourciNotFoundException(new MessageErreurDto(CodeErreur.VALIDATION, "Programme non trouvé"));
		}
		
		return raccourciService.lister(programme);
	}

	/**
	 * Ajouter un raccourci d'un programme
	 * 
	 * @param raccourci
	 * @param programme
	 * @param result
	 * @return Raccourci added
	 */
	@PostMapping
	public ResponseEntity<?> ajouterRaccourci(@Valid @RequestBody CreerRaccourciDto raccourci, @RequestParam String programme, BindingResult result) {
	
		if (result.hasErrors()) {
			throw new RaccourciException(new MessageErreurDto(CodeErreur.CREATION, "Donnée(s) invalide(s) pour l'ajout du raccourci"));
		}
		
		if (raccourciService.afficherParLibelle(raccourci.getLibelle()) != null) {
			throw new RaccourciAlreadyExistsException(new MessageErreurDto(CodeErreur.CREATION, "Le raccourci du programme associé existe déja"));
		}
		
		Raccourci nouveauRaccourci = raccourciService.ajouter(raccourci.getLibelle(), raccourci.getDescription(), raccourci.getTouches(), programme);
		RaccourciDto raccourciDto = RaccourciMapper.INSTANCE.raccourciToRaccourciDto(nouveauRaccourci);
		return ResponseEntity.ok(raccourciDto);
	}
	
	/**
	 * Modifier un raccourci
	 * 
	 * @param raccourci
	 * @param id
	 * @param result
	 * @return Raccourci modified
	 */
	@PatchMapping
	public ResponseEntity<?> modifierRaccourci(@Valid @RequestBody ModifierRaccourciDto raccourci, @RequestParam Integer id, BindingResult result) {
		
		if (result.hasErrors()) {
			throw new RaccourciNotFoundException(new MessageErreurDto(CodeErreur.MODIFICATION, "Donnée(s) invalide(s) pour l'ajout du raccourci"));
		}
		
		return ResponseEntity.ok(raccourciService.modifier(raccourci, id));
	}
	
	/**
	 * Supprimer un raccourci
	 * 
	 * @param id
	 * @param result
	 * @return Raccourci deleted
	 */
	@DeleteMapping
	public ResponseEntity<?> supprimerRaccourci(@RequestParam Integer id) {
				
		if(raccourciService.afficher(id).isEmpty()) {
			throw new RaccourciNotFoundException(new MessageErreurDto(CodeErreur.SUPPRESSION, "Raccourci inexistant"));
		}
		
		raccourciService.supprimer(id);
		return ResponseEntity.ok("Raccourci n°" + id + " supprimé");
	}
	
}
