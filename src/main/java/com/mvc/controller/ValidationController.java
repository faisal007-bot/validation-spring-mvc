package com.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.model.User;

@Controller
public class ValidationController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/form")
	public String form(@ModelAttribute("user")User user) {
		return "form";
	}
	
	@RequestMapping(path = "/process",method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("user")User user,BindingResult result) {
		if(result.hasErrors()) {
			return "form";
		}
		System.out.println("no errors");
		return "success";
	}
}
