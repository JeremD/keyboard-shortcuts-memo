package com.jeremd.keyboardshortcutsmemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeremd.keyboardshortcutsmemo.service.RaccourciService;

@RestController
@RequestMapping("raccourci")
public class RaccourciController {

	private RaccourciService raccourciService;

	public RaccourciController(RaccourciService raccourciService) {
		this.raccourciService = raccourciService;
	}

	/**
	 *
	 * Lister les raccourcis d'un programme
	 * 
	 * @param nomProgramme
	 * @return
	 */
	@GetMapping()
	public ResponseEntity<?> listerRaccourcis(@PathVariable String nomProgramme) {
		return ResponseEntity.status(HttpStatus.OK).body(raccourciService.afficher(nomProgramme));
	}

}
