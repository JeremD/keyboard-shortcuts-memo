package com.jeremd.keyboardshortcutsmemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jeremd.keyboardshortcutsmemo.exception.ProgrammeAlreadyExistsException;
import com.jeremd.keyboardshortcutsmemo.exception.ProgrammeException;
import com.jeremd.keyboardshortcutsmemo.exception.ProgrammeNotFoundException;
import com.jeremd.keyboardshortcutsmemo.exception.RaccourciAlreadyExistsException;
import com.jeremd.keyboardshortcutsmemo.exception.RaccourciException;
import com.jeremd.keyboardshortcutsmemo.exception.RaccourciNotFoundException;
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
	
	@ExceptionHandler(ProgrammeNotFoundException.class)
	public ResponseEntity<MessageErreurDto> quandProgrammeNonTrouveException(ProgrammeNotFoundException exception) {
		return ((BodyBuilder) ResponseEntity.notFound()).body(exception.getMessageErreur());
	}
	
	@ExceptionHandler(RaccourciNotFoundException.class)
	public ResponseEntity<MessageErreurDto> quandRaccourciNonTrouveException(RaccourciNotFoundException exception) {
		return ((BodyBuilder) ResponseEntity.notFound()).body(exception.getMessageErreur());
	}
	
	@ExceptionHandler(ProgrammeAlreadyExistsException.class)
	public ResponseEntity<MessageErreurDto> quandProgrammeExisteException(ProgrammeAlreadyExistsException exception) {
		return ((BodyBuilder) ResponseEntity.notFound()).body(exception.getMessageErreur());
	}
	
	@ExceptionHandler(RaccourciAlreadyExistsException.class)
	public ResponseEntity<MessageErreurDto> quandRaccourciExisteException(RaccourciAlreadyExistsException exception) {
		return ((BodyBuilder) ResponseEntity.notFound()).body(exception.getMessageErreur());
	}
	
	
	
}