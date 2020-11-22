package com.jeremd.keyboardshortcutsmemo.exception;

import com.jeremd.keyboardshortcutsmemo.dto.MessageErreurDto;

public class RaccourciNotFound extends ProgrammeException {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	public RaccourciNotFound(MessageErreurDto messageErreur) {
		super(messageErreur);
	}

}
