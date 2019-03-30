package com.medsys.medsysInterview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.medsys.medsysInterview.service.PersonDaoService;

@Controller
@ComponentScan
public class personController {
	
	@Autowired
	PersonDaoService service;
	@GetMapping("/")
	public String showPage()  {
		return "index";
	}
}
