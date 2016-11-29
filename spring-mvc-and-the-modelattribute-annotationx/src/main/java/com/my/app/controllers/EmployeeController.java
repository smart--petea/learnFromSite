package com.my.app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.app.models.Employee;

@Controller
public class EmployeeController {
	
	//private Map<Long, Employee> employeeMap = new HashMap<Long, Employee>();

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String submit(
			@ModelAttribute("employee") Employee employee,
			BindingResult result	
			) {
		if(result.hasErrors()) {
			return "errors";
		}
		
		return "employeeOKView";
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public String getSubmit(@ModelAttribute("employee") Employee employee) {
		return "employeeView";
	}
	
	@ModelAttribute
	public void addAttributes(Model model) {
		model.addAttribute("msg", "Welcome to the Netherlands!");
	}
}
