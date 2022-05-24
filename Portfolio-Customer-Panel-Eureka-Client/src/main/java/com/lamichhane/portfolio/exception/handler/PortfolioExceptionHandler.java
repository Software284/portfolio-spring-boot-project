package com.lamichhane.portfolio.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.lamichhane.portfolio.exception.classes.AwardsNotFoundException;
import com.lamichhane.portfolio.exception.classes.BlogContentNotFoundException;
import com.lamichhane.portfolio.exception.classes.ContactDetailNotFoundException;
import com.lamichhane.portfolio.exception.classes.ContactMediumNotFoundException;
import com.lamichhane.portfolio.exception.classes.CreativeProcessNotFoundException;
import com.lamichhane.portfolio.exception.classes.KnowldgeResumeNotFoundException;
import com.lamichhane.portfolio.exception.classes.ProjectsNotFoundException;
import com.lamichhane.portfolio.exception.classes.SkillProgressBarNotFoundException;
import com.lamichhane.portfolio.exception.classes.SpecializeNotFoundException;
import com.lamichhane.portfolio.exception.classes.StandardRestErrorResponse;
import com.lamichhane.portfolio.exception.classes.StatsNotFoundException;
import com.lamichhane.portfolio.exception.classes.TestimonialsNotFoundException;

@ControllerAdvice
public class PortfolioExceptionHandler  {
	
	// Add an exception handler for AwardsNotFoundException
	
		@ExceptionHandler
		public ResponseEntity<StandardRestErrorResponse> handleException(AwardsNotFoundException exc) {
			
			// create CustomerErrorResponse
			
			StandardRestErrorResponse error = new StandardRestErrorResponse(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			// return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		
		// Add an exception handler for BlogContentNotFoundException
		
		@ExceptionHandler
		public ResponseEntity<StandardRestErrorResponse> handleException(BlogContentNotFoundException exc) {
			
			StandardRestErrorResponse error = new StandardRestErrorResponse(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			// return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		// Add an exception handler for ContactDetailNotFoundException
		
		@ExceptionHandler
		public ResponseEntity<StandardRestErrorResponse> handleException(ContactDetailNotFoundException exc) {
			
			// create CustomerErrorResponse
			
			StandardRestErrorResponse error = new StandardRestErrorResponse(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			// return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		// Add an exception handler for ContactMediumNotFoundException
		
		@ExceptionHandler
		public ResponseEntity<StandardRestErrorResponse> handleException(ContactMediumNotFoundException exc) {
			
			// create CustomerErrorResponse
			
			StandardRestErrorResponse error = new StandardRestErrorResponse(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			// return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		// Add an exception handler for CreativeProcessNotFoundException
		
		@ExceptionHandler
		public ResponseEntity<StandardRestErrorResponse> handleException(CreativeProcessNotFoundException exc) {
			
			// create CustomerErrorResponse
			
			StandardRestErrorResponse error = new StandardRestErrorResponse(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			// return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		// Add an exception handler for KnowldgeResumeNotFoundException
		
		@ExceptionHandler
		public ResponseEntity<StandardRestErrorResponse> handleException(KnowldgeResumeNotFoundException exc) {
			
			// create CustomerErrorResponse
			
			StandardRestErrorResponse error = new StandardRestErrorResponse(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			// return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		// Add an exception handler for ProjectsNotFoundException
		
		@ExceptionHandler
		public ResponseEntity<StandardRestErrorResponse> handleException(ProjectsNotFoundException exc) {
			
			// create CustomerErrorResponse
			
			StandardRestErrorResponse error = new StandardRestErrorResponse(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			// return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		// Add an exception handler for SkillProgressBarNotFoundException
		
		@ExceptionHandler
		public ResponseEntity<StandardRestErrorResponse> handleException(SkillProgressBarNotFoundException exc) {
			
			// create CustomerErrorResponse
			
			StandardRestErrorResponse error = new StandardRestErrorResponse(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			// return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		// Add an exception handler for SpecializeNotFoundException
		
		@ExceptionHandler
		public ResponseEntity<StandardRestErrorResponse> handleException(SpecializeNotFoundException exc) {
			
			// create CustomerErrorResponse
			
			StandardRestErrorResponse error = new StandardRestErrorResponse(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			// return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		// Add an exception handler for StatsNotFoundException
		
		@ExceptionHandler
		public ResponseEntity<StandardRestErrorResponse> handleException(StatsNotFoundException exc) {
			
			// create CustomerErrorResponse
			
			StandardRestErrorResponse error = new StandardRestErrorResponse(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			// return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		// Add an exception handler for TestimonialsNotFoundException
		
		@ExceptionHandler
		public ResponseEntity<StandardRestErrorResponse> handleException(TestimonialsNotFoundException exc) {
			
			// create CustomerErrorResponse
			
			StandardRestErrorResponse error = new StandardRestErrorResponse(
												HttpStatus.NOT_FOUND.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			// return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		
		// Add another exception handler ... to catch any exception (catch all)

		@ExceptionHandler
		public ResponseEntity<StandardRestErrorResponse> handleException(Exception exc) {
			
			// create CustomerErrorResponse
			
			StandardRestErrorResponse error = new StandardRestErrorResponse(
												HttpStatus.BAD_REQUEST.value(),
												exc.getMessage(),
												System.currentTimeMillis());
			
			// return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		}

}
