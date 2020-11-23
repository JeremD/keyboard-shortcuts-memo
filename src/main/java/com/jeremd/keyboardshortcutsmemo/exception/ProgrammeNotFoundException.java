package com.jeremd.keyboardshortcutsmemo.exception;

import com.jeremd.keyboardshortcutsmemo.dto.MessageErreurDto;

public class ProgrammeNotFoundException extends ProgrammeException {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 *
	 * @param messageErreur
	 */
	public ProgrammeNotFoundException(MessageErreurDto messageErreur) {
		super(messageErreur);
	}

}
