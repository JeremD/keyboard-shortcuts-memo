package com.jeremd.keyboardshortcutsmemo.exception;

import com.jeremd.keyboardshortcutsmemo.dto.MessageErreurDto;

public class ProgrammeNotFound extends ProgrammeException {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	public ProgrammeNotFound(MessageErreurDto messageErreur) {
		super(messageErreur);
	}

}
