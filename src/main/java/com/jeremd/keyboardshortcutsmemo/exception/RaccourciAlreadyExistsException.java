package com.jeremd.keyboardshortcutsmemo.exception;

import com.jeremd.keyboardshortcutsmemo.dto.MessageErreurDto;

public class RaccourciAlreadyExistsException extends ProgrammeException {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 *
	 * @param messageErreur
	 */
	public RaccourciAlreadyExistsException(MessageErreurDto messageErreur) {
		super(messageErreur);
	}

}
