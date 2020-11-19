package com.jeremd.keyboardshortcutsmemo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeremd.keyboardshortcutsmemo.entity.Programme;
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
	 * @return
	 */
	@GetMapping("{programme}")
	public ResponseEntity<List<Raccourci>> listerRaccourcis(@PathVariable String programme) {
		
		List<Raccourci> listRaccourci = raccourciService.afficher(programme);
		
		return ResponseEntity.status(HttpStatus.OK).body(listRaccourci);
	}

}
