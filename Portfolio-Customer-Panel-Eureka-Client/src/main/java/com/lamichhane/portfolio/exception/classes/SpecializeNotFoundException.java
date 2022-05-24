package com.lamichhane.portfolio.exception.classes;

public class SpecializeNotFoundException extends RuntimeException {

	public SpecializeNotFoundException() {
	}

	public SpecializeNotFoundException(String message) {
		super(message);
	}

	public SpecializeNotFoundException(Throwable cause) {
		super(cause);
	}

	public SpecializeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public SpecializeNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
