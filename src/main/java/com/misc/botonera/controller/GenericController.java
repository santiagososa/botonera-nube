package com.misc.botonera.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/general")
public class GenericController {
	
	
	private static final Logger logger = Logger
			.getLogger(GenericController.class.getName());
	
	/**
	 * Handle every exception
	 * @param req
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public String handleError(HttpServletRequest req, Exception exception) {
		logger.severe("Request: " + req.getRequestURL() + " raised " + exception);
		return "generic-error";
	}
	
	@RequestMapping(value = "/404")
	public String handle404(final HttpServletRequest request) {
	    return "404";
	}
	

}
