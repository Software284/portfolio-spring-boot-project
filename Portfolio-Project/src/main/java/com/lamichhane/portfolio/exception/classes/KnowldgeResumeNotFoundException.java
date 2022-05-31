package com.lamichhane.portfolio.exception.classes;

public class KnowldgeResumeNotFoundException extends RuntimeException {

	public KnowldgeResumeNotFoundException() {
	}

	public KnowldgeResumeNotFoundException(String message) {
		super(message);
	}

	public KnowldgeResumeNotFoundException(Throwable cause) {
		super(cause);
	}

	public KnowldgeResumeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public KnowldgeResumeNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
