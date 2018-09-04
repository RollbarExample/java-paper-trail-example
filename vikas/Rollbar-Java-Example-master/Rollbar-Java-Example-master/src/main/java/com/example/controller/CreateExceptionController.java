package com.example.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.classic.Logger;

@Controller
public class CreateExceptionController {

	private final Logger logger = (Logger) LoggerFactory.getLogger(CreateExceptionController.class);
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showWecomePage() {
		return "welcome";
	}

	@SuppressWarnings("null")
	@RequestMapping(value = "/createException", method = RequestMethod.POST)
	public String throwException(ModelMap model) {
		System.out.println("Error : here....");
		
		logger.trace("trace logging");
        logger.debug("debug logging");
        logger.info("info logging");
        logger.warn("warning logging");
        logger.error("error logging", new RuntimeException("help"));
		
		String exception = null;
		exception.toCharArray();

		return "error";
	}
}
