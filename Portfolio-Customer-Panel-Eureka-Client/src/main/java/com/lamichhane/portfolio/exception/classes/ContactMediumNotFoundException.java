package com.lamichhane.portfolio.exception.classes;

public class ContactMediumNotFoundException extends RuntimeException {

	public ContactMediumNotFoundException() {
	}

	public ContactMediumNotFoundException(String message) {
		super(message);
	}

	public ContactMediumNotFoundException(Throwable cause) {
		super(cause);
	}

	public ContactMediumNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ContactMediumNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
