package com.jeremd.keyboardshortcutsmemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	 * @return
	 */
	@GetMapping("/programmes")
	public ResponseEntity<?> listerProgrammes() {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(programmeService.lister());
	}
	
}
