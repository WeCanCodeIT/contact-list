package org.wecancodeit.contactlist.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.contactlist.repositories.PersonRepository;

@Controller
@RequestMapping("/people")
public class PersonController {
	
	@Resource
	PersonRepository personRepo;

	@RequestMapping("")
	public String listPeople(Model model) {
		model.addAttribute("people", personRepo.findAll());
		return "people/index";
	}

	@RequestMapping("/{id}")
	public String listPerson(@PathVariable(value = "id") Long id,Model model) {
		model.addAttribute("person", personRepo.findById(id).get());
		return "people/person";
	}
}
