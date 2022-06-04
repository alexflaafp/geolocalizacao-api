package com.infoafp.domain.exception;

public class OrigemInexistenteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OrigemInexistenteException() {
		super();
	}

	public OrigemInexistenteException(String message, Throwable cause) {
		super(message, cause);
	}

	public OrigemInexistenteException(String message) {
		super(message);
	}

}
