package com.jeremd.keyboardshortcutsmemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeremd.keyboardshortcutsmemo.dto.CreerRaccourciDto;
import com.jeremd.keyboardshortcutsmemo.dto.ModifierRaccourciDto;
import com.jeremd.keyboardshortcutsmemo.dto.RaccourciDto;
import com.jeremd.keyboardshortcutsmemo.entity.Raccourci;
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
		return raccourciService.afficher(programme);
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
		Raccourci nouveauRaccourci = raccourciService.ajouter(raccourci.getLibelle(), raccourci.getDescription(), raccourci.getTouches(), programme);
		RaccourciDto raccourciDto = new RaccourciDto(nouveauRaccourci.getId(), nouveauRaccourci.getLibelle(), nouveauRaccourci.getDescription(), nouveauRaccourci.getLibelle(), nouveauRaccourci.getProgramme());
		return ResponseEntity.ok(raccourciDto);
	}
	
	@PatchMapping
	public public ResponseEntity<?> modifierRaccourci(@RequestBody ModifierRaccourciDto raccourci, @RequestParam String programme, @RequestParam Integer id, BindingResult result) {
		return ResponseEntity.ok(raccourci);
	}
	
}
