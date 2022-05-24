package com.lamichhane.portfolio.exception.classes;

public class StatsNotFoundException extends RuntimeException {

	public StatsNotFoundException() {
	}

	public StatsNotFoundException(String message) {
		super(message);
	}

	public StatsNotFoundException(Throwable cause) {
		super(cause);
	}

	public StatsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StatsNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
