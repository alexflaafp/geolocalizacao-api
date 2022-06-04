package com.infoafp.domain.exception;

public class DestinoInexistenteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DestinoInexistenteException() {
		super();
	}

	public DestinoInexistenteException(String message, Throwable cause) {
		super(message, cause);
	}

	public DestinoInexistenteException(String message) {
		super(message);
	}

}
