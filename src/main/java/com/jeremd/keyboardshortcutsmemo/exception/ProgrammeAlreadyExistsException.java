package com.jeremd.keyboardshortcutsmemo.exception;

import com.jeremd.keyboardshortcutsmemo.dto.MessageErreurDto;

public class ProgrammeAlreadyExistsException extends ProgrammeException {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 *
	 * @param messageErreur
	 */
	public ProgrammeAlreadyExistsException(MessageErreurDto messageErreur) {
		super(messageErreur);
	}

}
