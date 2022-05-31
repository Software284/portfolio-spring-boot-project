package com.lamichhane.portfolio.exception.classes;

public class ProjectsNotFoundException extends RuntimeException {

	public ProjectsNotFoundException() {
	}

	public ProjectsNotFoundException(String message) {
		super(message);
	}

	public ProjectsNotFoundException(Throwable cause) {
		super(cause);
	}

	public ProjectsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProjectsNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
