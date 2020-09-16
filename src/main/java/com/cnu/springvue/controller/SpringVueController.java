package com.cnu.springvue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringVueController {

	@RequestMapping({"/", "/main"})
	public String main(ModelMap model) {

		return "index.html";
	}

	@RequestMapping("/dashboard")
	public String dashboard(ModelMap model) {

		return "dashboard";
	}
	
}
