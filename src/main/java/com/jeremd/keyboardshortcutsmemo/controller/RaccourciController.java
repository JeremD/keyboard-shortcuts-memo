package com.jeremd.keyboardshortcutsmemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	@GetMapping()
	public List<Raccourci> listerRaccourcis(@RequestParam String programme) {
		
		return raccourciService.afficher(programme);
		
	}

}
