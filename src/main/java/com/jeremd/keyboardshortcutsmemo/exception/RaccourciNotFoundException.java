package com.jeremd.keyboardshortcutsmemo.exception;

import com.jeremd.keyboardshortcutsmemo.dto.MessageErreurDto;

public class RaccourciNotFoundException extends ProgrammeException {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 *
	 * @param messageErreur
	 */
	public RaccourciNotFoundException(MessageErreurDto messageErreur) {
		super(messageErreur);
	}

}
