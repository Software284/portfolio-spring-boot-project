package com.lamichhane.portfolio.exception.classes;

public class PartnersNotFoundException extends RuntimeException {

	public PartnersNotFoundException() {
	}

	public PartnersNotFoundException(String message) {
		super(message);
	}

	public PartnersNotFoundException(Throwable cause) {
		super(cause);
	}

	public PartnersNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public PartnersNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
