package com.lamichhane.portfolio.exception.classes;

public class CreativeProcessNotFoundException extends RuntimeException {

	public CreativeProcessNotFoundException() {
	}

	public CreativeProcessNotFoundException(String message) {
		super(message);
	}

	public CreativeProcessNotFoundException(Throwable cause) {
		super(cause);
	}

	public CreativeProcessNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CreativeProcessNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
