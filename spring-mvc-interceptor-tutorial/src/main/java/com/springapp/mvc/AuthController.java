package com.springapp.mvc;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AuthController {
	private static final Logger logger = Logger.getLogger("AuthController");
	
	@RequestMapping(method = RequestMethod.GET)
	public String printStatus(ModelMap model) {
		logger.info("AuthController -> printStatus");
		model.addAttribute("status", "Success!");
		
		return "auth";
	}
}
