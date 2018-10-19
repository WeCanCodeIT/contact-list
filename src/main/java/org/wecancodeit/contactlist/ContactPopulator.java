package org.wecancodeit.contactlist;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.contactlist.model.Contact;
import org.wecancodeit.contactlist.model.Person;
import org.wecancodeit.contactlist.repositories.ContactRepository;
import org.wecancodeit.contactlist.repositories.PersonRepository;

@Service
public class ContactPopulator implements CommandLineRunner {
	
	@Resource
	ContactRepository contactRepo;
	
	@Resource
	PersonRepository personRepo;

	@Override
	public void run(String... args) throws Exception {
		Contact contactOne = new Contact("123 Fake St.", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n" + 
				"tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n" + 
				"quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n" + 
				"consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n" + 
				"cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\r\n" + 
				"proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		Contact contactTwo = new Contact("56 NotMyAddress St.", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n" + 
				"tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n" + 
				"quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n" + 
				"consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n" + 
				"cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\r\n" + 
				"proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		
		contactOne = contactRepo.save(contactOne);
		contactTwo = contactRepo.save(contactTwo);
		
		Person personOne = new Person("Donny", "Hamilton", "6145555555", contactOne);
		Person personTwo = new Person("Alan", "Kostrick", "6145555555", contactTwo);
		Person personThree = new Person("Baby", "Kostrick", "6145555555", contactTwo);
		
		personRepo.save(personOne);
		personRepo.save(personTwo);
		personRepo.save(personThree);
	}

}