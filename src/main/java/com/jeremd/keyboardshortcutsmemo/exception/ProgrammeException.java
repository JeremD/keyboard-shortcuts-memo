package com.jeremd.keyboardshortcutsmemo.exception;

import com.jeremd.keyboardshortcutsmemo.dto.MessageErreurDto;

public class ProgrammeException extends RuntimeException {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** messageErreur */
	private MessageErreurDto messageErreur;

	/**
	 * Constructor
	 *
	 * @param message
	 */
	public ProgrammeException(MessageErreurDto messageErreur) {
		super(messageErreur.getMessage());
		this.messageErreur = messageErreur;
	}

	/**
	 * Getter
	 *
	 * @return the messageErreur
	 */
	public MessageErreurDto getMessageErreur() {
		return messageErreur;
	}


}
