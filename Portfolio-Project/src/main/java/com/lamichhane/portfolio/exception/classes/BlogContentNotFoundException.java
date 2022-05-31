package com.lamichhane.portfolio.exception.classes;

public class BlogContentNotFoundException extends RuntimeException {

	public BlogContentNotFoundException() {
	}

	public BlogContentNotFoundException(String message) {
		super(message);
	}

	public BlogContentNotFoundException(Throwable cause) {
		super(cause);
	}

	public BlogContentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public BlogContentNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
