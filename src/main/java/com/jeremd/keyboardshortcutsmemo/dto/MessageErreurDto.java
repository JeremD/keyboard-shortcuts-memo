package com.jeremd.keyboardshortcutsmemo.dto;

public class MessageErreurDto {

	/** code */
	private CodeErreur code;

	/** message */
	private String message;

	/**
	 * Constructor
	 * 
	 * @param code
	 * @param message
	 */
	public MessageErreurDto(CodeErreur code, String message) {
		this.code = code;
		this.message = message;
	}

	/**
	 * @return
	 */
	public CodeErreur getCode() {
		return code;
	}

	/**
	 * @param code
	 */
	public void setCode(CodeErreur code) {
		this.code = code;
	}

	/**
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}