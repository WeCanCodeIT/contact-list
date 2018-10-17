package org.wecancodeit.contactlist.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.contactlist.repositories.ContactRepository;

@Controller
public class ContactController {
	
	@Resource
	ContactRepository contactRepo;
	
	@GetMapping("/")
	public String home() {
		return "redirect:contacts";
	}
	
	@GetMapping("/contacts")
	public String getContacts(Model model) {
		model.addAttribute("contacts", contactRepo.findAll());
		return "contacts";
	}
	
	@GetMapping("/contacts/{id}")
	public String getContact(@PathVariable(value = "id") Long id, Model model) {
		System.out.println(id);
		model.addAttribute("contact", contactRepo.findById(id).get());
		return "contact";
	}

}
