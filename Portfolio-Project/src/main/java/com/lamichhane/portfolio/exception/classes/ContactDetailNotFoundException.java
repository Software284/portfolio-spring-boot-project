package com.lamichhane.portfolio.exception.classes;

public class ContactDetailNotFoundException extends RuntimeException {

	public ContactDetailNotFoundException() {
	}

	public ContactDetailNotFoundException(String message) {
		super(message);
	}

	public ContactDetailNotFoundException(Throwable cause) {
		super(cause);
	}

	public ContactDetailNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ContactDetailNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
