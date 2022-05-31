package com.lamichhane.portfolio.exception.classes;

public class TestimonialsNotFoundException extends RuntimeException {

	public TestimonialsNotFoundException() {
	}

	public TestimonialsNotFoundException(String message) {
		super(message);
	}

	public TestimonialsNotFoundException(Throwable cause) {
		super(cause);
	}

	public TestimonialsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public TestimonialsNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
