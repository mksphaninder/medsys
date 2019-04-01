package com.medsys.medsysInterview.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.medsys.medsysInterview.model.Person;
import com.medsys.medsysInterview.service.PersonDaoService;

@Controller

public class personController {
	
	@Autowired
	PersonDaoService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date - MM/dd/yyyy
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}
	
	@GetMapping("/index")
	public String showPage(ModelMap model)  {
		model.put("list", service.retreiveAll());
		return "index";
	}
	
	@PostMapping("/index")
	public String addpersonDetails( Person newPersonFromPage)  {
		//Person newPerson = new Person(person.getId(), person.getFname(), person.getLname(), person.getDob(), person.getAddr1(), person.getAddr2(), person.getCity(), person.getState(), person.getZip());
		service.save(newPersonFromPage);
		return "redirect:/index";
	}
}
