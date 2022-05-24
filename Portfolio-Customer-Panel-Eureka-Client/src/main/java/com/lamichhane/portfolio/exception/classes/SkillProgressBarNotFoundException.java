package com.lamichhane.portfolio.exception.classes;

public class SkillProgressBarNotFoundException extends RuntimeException {

	public SkillProgressBarNotFoundException() {
	}

	public SkillProgressBarNotFoundException(String message) {
		super(message);
	}

	public SkillProgressBarNotFoundException(Throwable cause) {
		super(cause);
	}

	public SkillProgressBarNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public SkillProgressBarNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
