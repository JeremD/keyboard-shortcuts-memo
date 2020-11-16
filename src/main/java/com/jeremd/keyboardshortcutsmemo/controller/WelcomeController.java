package com.jeremd.keyboardshortcutsmemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	public WelcomeController() {

	}

	/**
	 * Welcome
	 * 
	 * @return
	 */
	@GetMapping("/")
	public static String Welcome() {
		return "Bienvenue dans le mémo des raccourcis clavier";
	}
	

	/**
	 * About
	 * 
	 * @return
	 */
	@GetMapping("/about")
	public static String About() {
		return "API REST memo raccourci clavier";
	}
	
}
