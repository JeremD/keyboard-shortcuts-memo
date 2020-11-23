package com.jeremd.keyboardshortcutsmemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jeremd.keyboardshortcutsmemo.exception.ProgrammeException;
import com.jeremd.keyboardshortcutsmemo.exception.ProgrammeNotFound;
import com.jeremd.keyboardshortcutsmemo.exception.RaccourciException;
import com.jeremd.keyboardshortcutsmemo.exception.RaccourciNotFound;
import com.jeremd.keyboardshortcutsmemo.dto.MessageErreurDto;

@ControllerAdvice
public class GestionErreurControllerAdvice {
	
	@ExceptionHandler(ProgrammeException.class)
	public ResponseEntity<MessageErreurDto> quandProgrammeException(ProgrammeException exception) {
		return ResponseEntity.badRequest().body(exception.getMessageErreur());
	}
	
	@ExceptionHandler(RaccourciException.class)
	public ResponseEntity<MessageErreurDto> quandRaccourciException(RaccourciException exception) {
		return ResponseEntity.badRequest().body(exception.getMessageErreur());
	}
	
	@ExceptionHandler(ProgrammeNotFound.class)
	public ResponseEntity<MessageErreurDto> quandProgrammeNonTrouveException(ProgrammeNotFound exception) {
		return ((BodyBuilder) ResponseEntity.notFound()).body(exception.getMessageErreur());
	}
	
	@ExceptionHandler(RaccourciNotFound.class)
	public ResponseEntity<MessageErreurDto> quandRaccourciNonTrouveException(RaccourciNotFound exception) {
		return ((BodyBuilder) ResponseEntity.notFound()).body(exception.getMessageErreur());
	}
	
	
	
}