package com.lamichhane.portfolio.exception.classes;

public class AwardsNotFoundException extends RuntimeException {

	public AwardsNotFoundException() {
	}

	public AwardsNotFoundException(String message) {
		super(message);
	}

	public AwardsNotFoundException(Throwable cause) {
		super(cause);
	}

	public AwardsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public AwardsNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
